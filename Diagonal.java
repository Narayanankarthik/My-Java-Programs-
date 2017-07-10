1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
public static void main(String[] args) {
 
    String diag = "DIAGONALLY";
    String pad = "";
 
    for (int i = 0; i < diag.length(); i++)
    {
        pad = diag.substring(i, i + 1);
        pad = padLeft(pad, i + 1);
 
        System.out.println(pad);    
    }
}
 
public static String padLeft(String str, int position) {
    return String.format("%1$" + position + "s", str); 
}