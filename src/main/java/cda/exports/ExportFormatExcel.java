package cda.exports;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;

import cda.menu.model.Categorie;

public class ExportFormatExcel {
	private static List<Categorie> list = new ArrayList<Categorie>();
	
	
	private static HSSFCellStyle createStyleForTitle(HSSFWorkbook workbook) {
        HSSFFont font = workbook.createFont();
        font.setBold(true);
        HSSFCellStyle style = workbook.createCellStyle();
        style.setFont(font);
        return style;
    }
	

	
	
	public static List<Categorie> listeCategorie() {//Methode pour inserer des valeurs dans le tableau
		
 
		Categorie e1 = new Categorie(41, "Libelle1");
		Categorie e2 = new Categorie(42, "Libelle2");
		Categorie e3 = new Categorie(43, "Libelle3");
        list.add(e1);
        list.add(e2);
        list.add(e3);
        return list;
    }
	

//	public static List<Categorie> list = CrudCategoriePieceDAO.ConsulterCategorie();
	
	public static void exportCategorie() {
		listeCategorie();//on lance l'exectuion du remplissage du tableau, mais il faudrait aller chercher les valeurs depuis la methode ConsulterCategorie
		
		
		HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Catégories");
 
        int rownum = 0;
        Cell cell;
        Row row;
        //
        HSSFCellStyle style = createStyleForTitle(workbook);
 
        row = sheet.createRow(rownum);
 
        // EmpNo
        cell = row.createCell(0, CellType.STRING);
        cell.setCellValue("IDCategorie");
        cell.setCellStyle(style);
        // EmpName
        cell = row.createCell(1, CellType.STRING);
        cell.setCellValue("Libelle");
        cell.setCellStyle(style);

 
        // Data
        for (Categorie cat : list) {
            rownum++;
            row = sheet.createRow(rownum);
            //Id categorie(Colonne1)
            cell = row.createCell(0, CellType.NUMERIC);
            cell.setCellValue(cat.getIdCategorie());
            // Libelle (Colonne2)
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue(cat.getLibelle());

        }
        File file = new File("C:/demo/categories.xls");
        file.getParentFile().mkdirs();
 
        FileOutputStream outFile = null;
		try {
			outFile = new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			workbook.write(outFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Created file: " + file.getAbsolutePath());
        lireFichierExcelCategorie();
	}
	
	
	
	public static void lireFichierExcelCategorie() {
        // Read XSL file
        FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream(new File("C:/demo/categories.xls"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
 
        // Get the workbook instance for XLS file
        HSSFWorkbook workbook = null;
		try {
			workbook = new HSSFWorkbook(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
        // Get first sheet from the workbook
        HSSFSheet sheet = workbook.getSheetAt(0);
 
        // Get iterator to all the rows in current sheet
        Iterator<Row> rowIterator = sheet.iterator();
 
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            // Get iterator to all cells of current row
            Iterator<Cell> cellIterator = row.cellIterator();
 
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
 
                // Change to getCellType() if using POI 4.x
                CellType cellType = cell.getCellType();
 
                switch (cellType) {
                case _NONE:
                    System.out.print("");
                    System.out.print("\t");
                    break;
                case BOOLEAN:
                    System.out.print(cell.getBooleanCellValue());
                    System.out.print("\t");
                    break;
                case BLANK:
                    System.out.print("");
                    System.out.print("\t");
                    break;
                case FORMULA:
                    // Formula
                    System.out.print(cell.getCellFormula());
                    System.out.print("\t");
                     
                    FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
                    // Print out value evaluated by formula
                    System.out.print(evaluator.evaluate(cell).getNumberValue());
                    break;
                case NUMERIC:
                    System.out.print(cell.getNumericCellValue());
                    System.out.print("\t");
                    break;
                case STRING:
                    System.out.print(cell.getStringCellValue());
                    System.out.print("\t");
                    break;
                case ERROR:
                    System.out.print("!");
                    System.out.print("\t");
                    break;
                }
 
            }
            System.out.println("");
        }
    }
	}
	
	

