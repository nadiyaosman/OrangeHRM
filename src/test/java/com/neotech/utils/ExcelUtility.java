package com.neotech.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	private static Workbook book;
	private static Sheet sheet;
	
	
	private static void openExcel(String filePath) {
		try {
			FileInputStream fis = new FileInputStream(filePath);
			book = new XSSFWorkbook(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void loadSheet(String sheetName) {
		sheet = book.getSheet(sheetName);

	}

	private static int rowCount() {
		return sheet.getPhysicalNumberOfRows();
	}

	private static int columnCount(int rowIndex) {
		return sheet.getRow(rowIndex).getLastCellNum();
	}

	private static String cellData(int rowIndex, int columnIndex) {
		// return sheet.getRow(rowIndex).getCell(columnIndex).toString();
		// this can be used to read the values formulas in Excel
		return sheet.getRow(rowIndex).getCell(columnIndex).getRichStringCellValue().toString();
	}

	public static List<Map<String, String>> excelIntoListOfMaps(String filePath, String sheetName) {
		// open the excel file
		openExcel(filePath);

		// load the sheet
		loadSheet(sheetName);

		// initialize the list to fill the data and then return
		List<Map<String, String>> list = new ArrayList<>();

		for (int row = 1; row < rowCount(); row++) {
			Map<String, String> rowMap = new LinkedHashMap<>();

			for (int col = 0; col < columnCount(row); col++) {
				String key = cellData(0, col);
				String value = cellData(row, col);

				rowMap.put(key, value);
			}

			// add the filled map to the list
			list.add(rowMap);
		}

		return list;
	}

}
