package com.runsome.utils;
import java.io.File;
import java.util.List;

public class GetFiles {
	public void generateFileList(List<String> fileList,File node) {
        // add file only
        if (node.isFile()) {
           fileList.add(ZipFiles.generateZipEntry(node.toString()));
        }

        if (node.isDirectory()) {
            String[] subNote = node.list();
            for (String filename: subNote) {
                generateFileList(fileList, new File(node, filename));
            }
        }
    }
}
