class OOPS {
	public static void main(String[] args){
		String d = "  ";
		String[] lines = new String[7];
lines[0] = String.join(d,"   ***   ","   ***   "," *****    ","    ***** ");
lines[1] = String.join(d," **   ** "," **   ** "," **   **  ","  **      ");
lines[2] = String.join(d,"**     **","**     **"," **    ** "," **        ");
lines[3] = String.join(d,"**     **","**     **"," **   **  ","  *****   ");
lines[4] = String.join(d,"**     **","**     **"," *****    ","      **  ");
lines[5] = String.join(d," **   ** "," **   ** "," **       "," **   **  ");
lines[6] = String.join(d,"   ***   ","   ***   "," **       ","  *****   ");


for (String line:lines){
System.out.println(line);
}
}
}