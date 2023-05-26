package utilities;

import org.apache.poi.ss.usermodel.*;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

public class ExcelReader {

    private FileInputStream fis;
    private FileOutputStream fileout;
    private Workbook wb;
    private Sheet sh;
    private Cell cell;
    private Row row;
    private CellStyle cellStyle;
    private Color mycolor;
    private String excelfilepath;
    private Map<String, Integer> columns =new HashMap<>();

    public void setExcelFile(String ExcelPath,String SheetName) throws Exception {
        try {
            File fis = new File(ExcelPath);
            wb = WorkbookFactory.create(fis);
            sh = wb.getSheet(SheetName);

            this.excelfilepath = ExcelPath;

            sh.getRow(0).forEach(cell -> {
                columns.put(cell.getStringCellValue(), cell.getColumnIndex());
            } );
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public String getCellData(int rownum, int colnum) throws Exception{
        try {
            cell = sh.getRow(rownum).getCell(colnum);
            String CellData = null;

            switch (cell.getCellType()){
                case STRING:
                    CellData = cell.getStringCellValue();
                    break;
                case NUMERIC:
                    if (DateUtil.isCellDateFormatted(cell)){
                        CellData = String.valueOf(cell.getDateCellValue());
                    }
                    else {
                        CellData = String.valueOf((long)cell.getNumericCellValue());
                    }
                    break;
                case BOOLEAN:
                    CellData = Boolean.toString(cell.getBooleanCellValue());
                    break;
                case BLANK:
                    CellData = "";
                    break;
            }
            return CellData;

        }catch (Exception e){
            return "";
        }
    }

    public String getCellData(String columnName, int rownum) throws Exception {
        return getCellData(rownum, columns.get(columnName));
    }


    public static void main(String[] args) throws Exception {

        ExcelReader excel = new ExcelReader();

        excel.setExcelFile("C:\\Users\\arjunshekar_g\\OneDrive - HCL Technologies Ltd\\Desktop\\manual testcases.xlsx", "Sheet2");

        System.out.println(excel.getCellData("Input fieldss", 1));

        System.out.println(excel.getCellData("Input fields", 2));

        System.out.println(excel.getCellData("Input fields", 3));


        System.out.println(excel.getCellData("Test data", 1));

        System.out.println(excel.getCellData("Test data", 2));

        System.out.println(excel.getCellData("Test data", 3));


    }

}

