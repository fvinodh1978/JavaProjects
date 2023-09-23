package examples;// Java Program to Illustrate Reading
// Data to Excel File Using Apache POI

// Import statements

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Main class
public class ExcelUtils {
    // Main driver method
    public static void main(String[] args) {
        ExcelUtils eu = new ExcelUtils();
        String inputFile = "";
        String outFile = "";

        // Read Excel File
        inputFile = "C:\\Users\\054544744\\IdeaProjects\\FST Java\\src\\main\\resources\\Users.xlsx";
//        eu.readxlsx(inputFile);

        // Convert Excel to Binary File
        inputFile = "C:\\Users\\054544744\\IdeaProjects\\FST Java\\src\\main\\resources\\Users.xlsx";
        outFile = "C:\\Users\\054544744\\IdeaProjects\\FST Java\\src\\main\\resources\\Users.bin";
//        eu.convertExcelToBin(inputFile, outFile);

        // Convert Binary to Excel File
        inputFile = "C:\\Users\\054544744\\IdeaProjects\\FST Java\\src\\main\\resources\\Users.bin";
        outFile = "C:\\Users\\054544744\\IdeaProjects\\FST Java\\src\\main\\resources\\Users1.xlsx";
//        eu.convertBinaryToExcel(inputFile, outFile);

        // Convert Excel to CSV File
        inputFile = "C:\\Users\\054544744\\IdeaProjects\\FST Java\\src\\main\\resources\\Users.xlsx";
        outFile = "C:\\Users\\054544744\\IdeaProjects\\FST Java\\src\\main\\resources";
        eu.convertExcelToCSV(inputFile, outFile);
    }

    public void convertExcelToCSV(String inputFile, String outFile) {
        FileInputStream inp = null;
        int colCount = 0;
        int rowCount = 0;
        try {
            inp = new FileInputStream(inputFile);
            XSSFWorkbook wb = new XSSFWorkbook(inp);

            for (int i = 0; i < wb.getNumberOfSheets(); i++) {
                System.out.println(wb.getSheetAt(i).getSheetName());
                XSSFSheet sheet = wb.getSheetAt(i);
                String sheetName = wb.getSheetAt(i).getSheetName();

                StringBuffer data = new StringBuffer();
                FileOutputStream fos = new FileOutputStream(outFile + "\\" + sheetName + ".csv");
                Row row;
                colCount = getColumnsCount(sheet);
                System.out.printf("Number of Columns = %d\n", colCount);
                Iterator<Row> rowIterator = sheet.iterator();
                rowCount = 0;
                while (rowIterator.hasNext()) {
                    row = rowIterator.next();
                    row.getLastCellNum();
                    Iterator<Cell> cellIterator = row.cellIterator();
                    System.out.printf("Current Row = %d\n", rowCount);
//                    while (cellIterator.hasNext()) {
                    for (int j = 0; j < colCount; j++) {
                        Cell cell = row.getCell(j, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                        System.out.printf("Current cell = %d\n", j);
//                        cell = cellIterator.next();

                        if (!(cell == null)) {
                            CellType type = cell.getCellType();

                            System.out.println("Current cell Type = " + type);
                            if (type == CellType.BOOLEAN) {
                                System.out.printf("Current cell = %s\n", cell.getBooleanCellValue());
                                data.append(cell.getBooleanCellValue() + ",");
                            } else if (type == CellType.NUMERIC) {
                                System.out.printf("Current cell = %f\n", cell.getNumericCellValue());
                                data.append(cell.getNumericCellValue() + ",");
                            } else if (type == CellType.STRING) {
                                System.out.printf("Current cell = %s\n", cell.getStringCellValue());
                                data.append(cell.getStringCellValue() + ",");
                            } else if (type == CellType.BLANK) {
                                System.out.println("In Blank");
                                data.append(",");
                            } else if (cell == null || cell.getStringCellValue() == "") {
                                System.out.println("In Null");
                                data.append(",");
                            } else {
                                System.out.println("In Else");
                                data.append(cell + ",");
                            }
                        }
                    }
                    data.append('\n');
                    rowCount++;
                }
                fos.write(data.toString().getBytes());
                fos.close();
            }
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            try {
                inp.close();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
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

    public void convertExcelToBin(String inputFile, String outFile) {
        try {
            // Load the Excel file
            FileInputStream excelFile = new FileInputStream(new File(inputFile));
            Workbook workbook = new XSSFWorkbook(excelFile);

            // Create a binary output stream
            FileOutputStream binaryFile = new FileOutputStream(outFile);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(binaryFile);

            // Iterate through each sheet and write its content to the binary file
            for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
                Sheet sheet = workbook.getSheetAt(i);
                for (Row row : sheet) {
                    for (Cell cell : row) {
                        objectOutputStream.writeObject(cell.toString().getBytes());
                    }
                }
            }

            // Close the streams
            objectOutputStream.close();
            binaryFile.close();

            System.out.println("Excel file converted to binary file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void convertBinaryToExcel(String inputFile, String outFile) {
        try {
            // Create a new Excel workbook
            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("Sheet1");

            // Open the binary input stream
            FileInputStream binaryFile = new FileInputStream(inputFile);
            ObjectInputStream objectInputStream = new ObjectInputStream(binaryFile);

            int rowNum = 0;
            while (true) {
                try {
                    // Read binary data from the input stream
                    byte[] bytes = (byte[]) objectInputStream.readObject();

                    // Create a new row and cell
                    Row row = sheet.createRow(rowNum++);
                    Cell cell = row.createCell(0);

                    // Set the cell value from the binary data
                    cell.setCellValue(new String(bytes));
                } catch (EOFException e) {
                    // End of file reached
                    break;
                }
            }

            // Close the input stream
            objectInputStream.close();

            // Write the Excel workbook to a file
            FileOutputStream excelFile = new FileOutputStream(outFile);
            workbook.write(excelFile);
            excelFile.close();

            System.out.println("Binary file converted to Excel file successfully.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Count max number of nonempty cells in sheet rows
    public int getColumnsCount(XSSFSheet xssfSheet) {
        int result = 0;
        Iterator<Row> rowIterator = xssfSheet.iterator();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            List<Cell> cells = new ArrayList<>();
            Iterator<Cell> cellIterator = row.cellIterator();
            while (cellIterator.hasNext()) {
                cells.add(cellIterator.next());
            }
            result = Math.max(cells.size(), result);

//            for (int i = cells.size(); i >= 0; i--) {
//                Cell cell = cells.get(i-1);
//                if (cell.toString().trim().isEmpty()) {
//                    cells.remove(i-1);
//                } else {
//                    result = cells.size() > result ? cells.size() : result;
//                    break;
//                }
//            }
        }
        return result;
    }
}
