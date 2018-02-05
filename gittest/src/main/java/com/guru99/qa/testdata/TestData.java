package com.guru99.qa.testdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;

import com.guru99.qa.Base.TestBase;

public class TestData extends TestBase {
	public static FileInputStream file;

	public TestData() throws IOException {
		super();
	}

	public static void ExcelSetup() {
		try {
			file = new FileInputStream(Prop.getProperty("FilePath"));
			Excelbook = new XSSFWorkbook(file);
			ExcelSheet = Excelbook.getSheet(Prop.getProperty("NewCustomerSheet"));
		} catch (FileNotFoundException FOF) {
			FOF.getStackTrace();
		} catch (IOException E) {
			E.getStackTrace();
		}
	}

	public static XSSFCell[] BountryCells(String filename) {
		DataFormatter formatter = new DataFormatter();
		XSSFCell[] cells = new XSSFCell[2];
		String pos = "Begin";
		for (Row row : ExcelSheet) {
			for (Cell cell : row) {
				if (filename.equals(formatter.formatCellValue(cell))) {
					if (pos.equalsIgnoreCase("Begin")) {
						cells[0] = (XSSFCell) cell;
						pos = "End";
					} else {
						cells[1] = (XSSFCell) cell;
					}
				}
			}
		}
		return cells;
	}

	public static String[][] GetData(String filename) {
		DataFormatter formatter = new DataFormatter();
		String[][] datacells = null;
		try {
			XSSFCell[] boundrycells = BountryCells(filename);
			XSSFCell StartCell = boundrycells[0];
			XSSFCell EndCell = boundrycells[1];
			int FirstRow = StartCell.getRowIndex() + 1;
			int LastRow = EndCell.getRowIndex() - 1;
			int FirstCol = StartCell.getColumnIndex() + 1;
			int LastCol = EndCell.getColumnIndex() - 1;
			datacells = new String[LastRow - FirstRow + 1][LastCol - FirstCol + 1];
			for (int i = FirstRow; i < LastRow + 1; i++) {
				for (int j = FirstCol; j < LastCol + 1; j++) {
					Cell cell = ExcelSheet.getRow(i).getCell(j);
					datacells[i - FirstRow][j - FirstCol] = formatter.formatCellValue(cell);
				}
			}
		} catch (Exception FOF) {
			FOF.printStackTrace();
		}
		return datacells;
	}
}