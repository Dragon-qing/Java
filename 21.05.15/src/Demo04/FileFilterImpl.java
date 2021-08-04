package Demo04;

import java.io.File;
import java.io.FileFilter;
import java.util.Locale;

public class FileFilterImpl implements FileFilter {

    @Override
    public boolean accept(File pathname) {
        if(pathname.isDirectory())return true;
        return pathname.getName().toLowerCase().endsWith(".java");
    }
}
