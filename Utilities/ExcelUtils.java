package examples;// Java Program to Illustrate Reading
// Data to Excel File Using Apache POI

// Import statements

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;

import java.io.*;
import java.util.Iterator;

// Main class
public class ExcelUtils {
    // Main driver method
    public static void main(String[] args) {
        ExcelUtils eu = new ExcelUtils();
        String inputFile = "C:\\Users\\054544744\\IdeaProjects\\FST Java\\src\\main\\resources\\Users.xlsx";
//        eu.readxlsx(inputFile);

        InputStream inp = null;
        try {
            inp = new FileInputStream(inputFile);
            XSSFWorkbook wb = new XSSFWorkbook(inp);

            for (int i = 0; i < wb.getNumberOfSheets(); i++) {
                System.out.println(wb.getSheetAt(i).getSheetName());
                eu.convertExcelToCSV(wb.getSheetAt(i), wb.getSheetAt(i).getSheetName());
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                inp.close();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public void convertExcelToCSV(XSSFSheet sheet, String sheetName) {
        StringBuffer data = new StringBuffer();
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\054544744\\IdeaProjects\\FST Java\\src\\main\\resources\\" + sheetName + ".csv");
            Cell cell;
            Row row;
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) {
                row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();
                while (cellIterator.hasNext()) {
                    cell = cellIterator.next();

                    CellType type = cell.getCellType();
                    if (type == CellType.BOOLEAN) {
                        data.append(cell.getBooleanCellValue() + ",");
                    } else if (type == CellType.NUMERIC) {
                        data.append(cell.getNumericCellValue() + ",");
                    } else if (type == CellType.STRING) {
                        data.append(cell.getStringCellValue() + ",");
                    } else if (type == CellType.BLANK ) {
                        data.append(",");
                    }else if(cell==null || cell.getStringCellValue() == "") {
                        data.append(",");
                    } else {
                        data.append(cell + ",");
                    }
                }
                data.append('\n');
            }
            fos.write(data.toString().getBytes());
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readxlsx(String inputFile) {

        // Try block to check for exceptions
        try {

            // Reading file from local directory
            FileInputStream file = new FileInputStream(new File(inputFile));

            // Create Workbook instance holding reference to
            // .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file);

            // Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);

            // Iterate through each rows one by one

            // Till there is an element condition holds true
            for (Row row : sheet) {
                // For each row, iterate through all the
                // columns
                Iterator<Cell> cellIterator
                        = row.cellIterator();

                while (cellIterator.hasNext()) {

                    Cell cell = cellIterator.next();

                    // Checking the cell type and format
                    // accordingly
                    switch (cell.getCellType()) {
                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t");
                            break;
                        case STRING:
                            System.out.print(cell.getStringCellValue() + "\t");
                            break;
                        case BOOLEAN:
                            System.out.print(cell.getBooleanCellValue());
                            break;
                        case BLANK:
                            System.out.print("");
                            break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + cell.getCellType());
                    }
                }

                System.out.println();
            }

            // Closing file output streams
            file.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
