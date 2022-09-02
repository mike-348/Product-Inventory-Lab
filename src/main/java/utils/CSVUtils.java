package utils;

import models.Sneaker;

import java.io.*;
import java.util.List;

public class CSVUtils {

    private static final String COMMA_DELIMITER = ",";

    public static void writeLine(FileWriter writer, List<Object> list) throws IOException {
        boolean first = true;
        StringBuilder sb = new StringBuilder();
        for (Object product : list) {
            if (!first) {
                sb.append(COMMA_DELIMITER);
            }
            sb.append(product.toString());
            first = false;
        }
        sb.append("\n");
        writer.write(sb.toString());
    }
}