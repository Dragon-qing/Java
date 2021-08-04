package t4;

import java.io.*;

public class t4 {
    public static void main(String[] args) {
        File en=new File("1.txt");
        File de=new File("2.txt");
        try {
            encodeFile(en,de);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void encodeFile(File encodingFile, File decodedFile) throws IOException {
        FileInputStream fis =new FileInputStream(encodingFile);
        FileOutputStream fos=new FileOutputStream(decodedFile);
        byte[] bytes=new byte[1024];
        int len=0;
        StringBuffer sb=new StringBuffer();
        while((len=fis.read(bytes))!=-1){
            sb.append(new String(bytes,0,len));
        }
        String s=sb.toString();
        for(int i=0;i<s.length();++i){
            char c=s.charAt(i);
            if(c<='9'&&c>='0'){
                if(c=='9'){
                    c='0';
                }else {
                    c += 1;
                }
            }else if(c>='a'&&c<='z'||c>='A'&&c<='Z'){
                if(c=='z'||c=='Z'){
                    if(c=='z') c='a';
                    else c='A';
                }else{
                    c+=1;
                }
            }
            sb.replace(i,i+1,String.valueOf(c));
        }
        fos.write(sb.toString().getBytes());
    }
}
