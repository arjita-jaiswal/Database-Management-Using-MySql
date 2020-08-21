import java.sql.*;
import java.io.*;
import java.util.Scanner;

public class dbms1 {

	public static void main(String[] args) throws Exception{
 		File f1 = new File("C:\\Users\\dell\\Documents\\CS241 DBMS  LAB\\Lab2\\file\\files\\student.txt");
 		FileReader fr= new FileReader(f1);
 		Scanner sc =new Scanner(fr);
		System.out.println("Q1.");
 		
 		while(sc.hasNextLine()){
			String str=sc.nextLine();
			String[] a1=str.split(",");
			int l=a1.length;
			System.out.println("Name: "+a1[1]+"   Age: "+a1[l-1]);
		}
		System.out.println("-------------------------------------------------------");
		fr.close();
		sc.close();
		File f11 = new File("C:\\Users\\dell\\Documents\\CS241 DBMS  LAB\\Lab2\\file\\files\\student.txt");
 		FileReader fr1= new FileReader(f11);
 		Scanner sc1 =new Scanner(fr1);
		System.out.println("Q2.");
		while(sc1.hasNextLine()){
			String str=sc1.nextLine();
			String[] a1=str.split(",");
			int l=a1.length;
			if(Integer.valueOf(a1[l-1])>18){
				System.out.println("Serial No. :"+a1[0]+" Name: "+a1[1]+" Major: "+a1[2]+" Level: "+a1[3]+" Age: "+a1[4]);
			}
		}
		System.out.println("-------------------------------------------------------");
		fr1.close();
		sc1.close();
		File f111 = new File("C:\\Users\\dell\\Documents\\CS241 DBMS  LAB\\Lab2\\file\\files\\enrolled.txt");
 		FileReader fr11= new FileReader(f111);
 		Scanner sc11 =new Scanner(fr11);
		System.out.println("Q3.");

		
		while(sc11.hasNextLine()){
			String str=sc11.nextLine();
			String[] a1=str.split(",");
			int l=a1.length;
			if((a1[l-1]).equals("Database Systems")){
				System.out.println("Serial No. :"+a1[0]);
			}
		}
		
		System.out.println("-------------------------------------------------------");
		fr11.close();
		sc11.close();
		
		File f4 = new File("C:\\Users\\dell\\Documents\\CS241 DBMS  LAB\\Lab2\\file\\files\\enrolled.txt");
 		FileReader fr4= new FileReader(f4);
 		Scanner sc4 =new Scanner(fr4);
		System.out.println("Q4. "+"Name of students enrolled in Database Systems :");
		
		
		
		while(sc4.hasNextLine()){
			String str=sc4.nextLine();
			String[] a1=str.split(",");
			int l=a1.length;
			if((a1[l-1]).equals("Database Systems")){
				File f41 = new File("C:\\Users\\dell\\Documents\\CS241 DBMS  LAB\\Lab2\\file\\files\\student.txt");
 				FileReader fr41= new FileReader(f41);
 				Scanner sc41 =new Scanner(fr41);
				while(sc41.hasNextLine()){
					String str2=sc41.nextLine();
					String[] a12=str2.split(",");
					int l2=a12.length;
					if((a12[0]).equals(a1[0])){
						System.out.println(a12[1]);
					}
				}
			fr41.close();
			sc41.close();	
			}
		}
			

		System.out.println("-------------------------------------------------------");
		fr4.close();
		sc4.close();
		
		File f2 = new File("C:\\Users\\dell\\Documents\\CS241 DBMS  LAB\\Lab2\\file\\files\\faculty.txt");
 		FileReader fr2= new FileReader(f2);
 		Scanner sc2 =new Scanner(fr2);
		System.out.println("Q5. "+"Names of faculty having department no. 20");
		
		while(sc2.hasNextLine()){
			String str=sc2.nextLine();
			String[] a1=str.split(",");
			int l=a1.length;
			if((a1[l-1]).equals("20")){
				System.out.println(a1[1]);
			}
		}
		
		System.out.println("-------------------------------------------------------");
		fr2.close();
		sc2.close();
		File f21 = new File("C:\\Users\\dell\\Documents\\CS241 DBMS  LAB\\Lab2\\file\\files\\class.txt");
 		FileReader fr21= new FileReader(f21);
 		Scanner sc21 =new Scanner(fr21);
		System.out.println("Q6. ");
		
		while(sc21.hasNextLine()){
			String str=sc21.nextLine();
			String[] a1=str.split(",");
			int l=a1.length;
			if((a1[l-2]).equals("R128")){
				System.out.println("Name : "+a1[0]+"  Meets at : "+a1[1]+"  Faculty id : "+a1[l-1]);
			}
		}

		System.out.println("-------------------------------------------------------");
		fr21.close();
		sc21.close();
		File f7 = new File("C:\\Users\\dell\\Documents\\CS241 DBMS  LAB\\Lab2\\file\\files\\class.txt");
 		FileReader fr7= new FileReader(f7);
 		Scanner sc7 =new Scanner(fr7);
		
		System.out.println("Q7. ");
		
		
		while(sc7.hasNextLine()){
			String str=sc7.nextLine();
			String[] a1=str.split(",");
			int l=a1.length;
			if((a1[l-2]).equals("R128")){
				File f71 = new File("C:\\Users\\dell\\Documents\\CS241 DBMS  LAB\\Lab2\\file\\files\\faculty.txt");
 				FileReader fr71= new FileReader(f71);
 				Scanner sc71 =new Scanner(fr71);
				while(sc71.hasNextLine()){
					String str2=sc71.nextLine();
					String[] a12=str2.split(",");
					int l2=a12.length;
					if((a12[0]).equals(a1[l-1])){
						System.out.println("Id : "+a12[0]+" Name : "+a12[1]+" Department : "+a12[2]);
					}
				}
				fr71.close();
				sc71.close();	
			}
		}


		System.out.println("-------------------------------------------------------");
		fr7.close();
		sc7.close();
		File f8 = new File("C:\\Users\\dell\\Documents\\CS241 DBMS  LAB\\Lab2\\file\\files\\class.txt");
 		FileReader fr8= new FileReader(f8);
 		Scanner sc8 =new Scanner(fr8);
		
		System.out.println("Q8. ");
		
		
		while(sc8.hasNextLine()){
			String str=sc8.nextLine();
			String[] a1=str.split(",");
			int l=a1.length;
			if((a1[0]).equals("Data Structures")){
				File f81 = new File("C:\\Users\\dell\\Documents\\CS241 DBMS  LAB\\Lab2\\file\\files\\faculty.txt");
 				FileReader fr81= new FileReader(f81);
 				Scanner sc81 =new Scanner(fr81);
				while(sc81.hasNextLine()){
					String str2=sc81.nextLine();
					String[] a12=str2.split(",");
					int l2=a12.length;
					if((a12[0]).equals(a1[l-1])){
						System.out.println(a12[1]);
					}
				}
				fr81.close();
				sc81.close();	
			}
		}

		System.out.println("-------------------------------------------------------");
		fr8.close();
		sc8.close();
		File f9 = new File("C:\\Users\\dell\\Documents\\CS241 DBMS  LAB\\Lab2\\file\\files\\faculty.txt");
 		FileReader fr9= new FileReader(f9);
 		Scanner sc9 =new Scanner(fr9);
		
		System.out.println("Q9. ");
		
		
		while(sc9.hasNextLine()){
			String str=sc9.nextLine();
			String[] a1=str.split(",");
			int l=a1.length;
			if((a1[1]).equals("Ivana Teach")){
				File f91 = new File("C:\\Users\\dell\\Documents\\CS241 DBMS  LAB\\Lab2\\file\\files\\class.txt");
 				FileReader fr91= new FileReader(f91);
 				Scanner sc91 =new Scanner(fr91);
				while(sc91.hasNextLine()){
					String str2=sc91.nextLine();
					String[] a12=str2.split(",");
					int l2=a12.length;
					if((a12[l2-1]).equals(a1[0])){
						File f92= new File("C:\\Users\\dell\\Documents\\CS241 DBMS  LAB\\Lab2\\file\\files\\enrolled.txt");
 						FileReader fr92= new FileReader(f92);
 						Scanner sc92 =new Scanner(fr92);
						while(sc92.hasNextLine()){
							String str3=sc92.nextLine();
							String[] a13=str3.split(",");
							int l3=a13.length;
							if((a12[0]).equals(a13[1])){
								File f93= new File("C:\\Users\\dell\\Documents\\CS241 DBMS  LAB\\Lab2\\file\\files\\student.txt");
 								FileReader fr93= new FileReader(f93);
 								Scanner sc93 =new Scanner(fr93);
								while(sc93.hasNextLine()){
									String str4=sc93.nextLine();
									String[] a14=str4.split(",");
									int l4=a14.length;
									if((a14[0]).equals(a13[0])){
										System.out .println(a14[1]);
									}
								}
								fr93.close();
								sc93.close();
							}
						}
						fr92.close();
						sc92.close();
					}
				}
				fr91.close();
				sc91.close();	
			}
		}



		System.out.println("-------------------------------------------------------");
		fr9.close();
		sc9.close();
		File f10 = new File("C:\\Users\\dell\\Documents\\CS241 DBMS  LAB\\Lab2\\file\\files\\faculty.txt");
 		FileReader fr10= new FileReader(f10);
 		Scanner sc10 =new Scanner(fr10);
		
		System.out.println("Q10. ");
		
		
		while(sc10.hasNextLine()){
			String str=sc10.nextLine();
			String[] a1=str.split(",");
			int l=a1.length;
			if((a1[1]).equals("Ivana Teach")){
				File f101 = new File("C:\\Users\\dell\\Documents\\CS241 DBMS  LAB\\Lab2\\file\\files\\class.txt");
 				FileReader fr101= new FileReader(f101);
 				Scanner sc101 =new Scanner(fr101);
				while(sc101.hasNextLine()){
					String str2=sc101.nextLine();
					String[] a12=str2.split(",");
					int l2=a12.length;
					if((a12[l2-1]).equals(a1[0])){
						File f102= new File("C:\\Users\\dell\\Documents\\CS241 DBMS  LAB\\Lab2\\file\\files\\enrolled.txt");
 						FileReader fr102= new FileReader(f102);
 						Scanner sc102 =new Scanner(fr102);
						while(sc102.hasNextLine()){
							String str3=sc102.nextLine();
							String[] a13=str3.split(",");
							int l3=a13.length;
							if((a12[0]).equals(a13[1])){
								File f103= new File("C:\\Users\\dell\\Documents\\CS241 DBMS  LAB\\Lab2\\file\\files\\student.txt");
 								FileReader fr103= new FileReader(f103);
 								Scanner sc103 =new Scanner(fr103);
								while(sc103.hasNextLine()){
									String str4=sc103.nextLine();
									String[] a14=str4.split(",");
									int l4=a14.length;
									if((a14[0]).equals(a13[0]) && (a14[3]).equals("JR") ){
										System.out .println(a14[1]);
									}
								}
								fr103.close();
								sc103.close();
							}
						}
						fr102.close();
						sc102.close();
					}
				}
				fr101.close();
				sc101.close();	
			}
		}





		System.out.println("-------------------------------------------------------");
		fr10.close();
		sc10.close();
		File f011 = new File("C:\\Users\\dell\\Documents\\CS241 DBMS  LAB\\Lab2\\file\\files\\student.txt");
 		FileReader fr011= new FileReader(f011);
 		Scanner sc011 =new Scanner(fr011);
		
		System.out.println("Q11. ");
		
		
		while(sc011.hasNextLine()){
			String str=sc011.nextLine();
			String[] a1=str.split(",");
			int l=a1.length;
			if((a1[1]).equals("Joseph Thompson")){
				File f0111 = new File("C:\\Users\\dell\\Documents\\CS241 DBMS  LAB\\Lab2\\file\\files\\enrolled.txt");
 				FileReader fr0111= new FileReader(f0111);
 				Scanner sc0111 =new Scanner(fr0111);
				while(sc0111.hasNextLine()){
					String str2=sc0111.nextLine();
					String[] a12=str2.split(",");
					int l2=a12.length;
					if((a12[0]).equals(a1[0])){
						System.out.println(a12[1]);
					}
				}	
			}
		}

	}
}
