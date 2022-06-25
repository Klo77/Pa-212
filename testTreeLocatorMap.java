
public class testTreeLocatorMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Test add and remove
				/*TreeLocatorMap<String> t1 = new TreeLocatorMap<String>();
				Location l1 = new Location(4,7);
				t1.add("F",l1 );
				l1 = new Location(5,7);
				t1.add("V",l1 );
				l1 = new Location(6,1);
				t1.add("K",l1 );
				l1 = new Location(4,3);
				t1.add("D",l1 );
				l1 = new Location(4,8);
				t1.add("O", l1);
				l1 = new Location(8,4);
				t1.add("U", l1);
				l1 = new Location(8,2);
				t1.add("V", l1);
				l1 = new Location(2,2);
				t1.add("Y", l1);
				l1 = new Location(6,1);
				t1.add("S", l1);
				Pair<Boolean, Integer> p = t1.add("S", l1);
				System.out.println("Adding S = "+p.first+" , nb comparision = "+p.second);
				l1 = new Location(6,3);
				t1.add("B", l1);
				t1.BSTdisplayinorder();
				t1.Treedisplayinorder();
				System.out.println("--------------");
				Pair<Boolean, Integer> res = t1.remove("D");
				System.out.println("Remove D = "+res.first+" , nb comparision = "+res.second);
				l1 = new Location(4,3); 
				res = t1.remove("A"); //Test: incorrect data and the data in location is empty
				System.out.println("Remove A = "+res.first+" , nb comparision = "+res.second);
				l1 = new Location(6,3); //Test: incorrect location
				res = t1.remove("D"); 
				System.out.println("Remove D = "+res.first+" , nb comparision = "+res.second);
				l1 = new Location(2,2); 
				res = t1.remove("A"); //Test: incorrect data 
				System.out.println("Remove A = "+res.first+" , nb comparision = "+res.second);
				l1 = new Location(6,1); 
				res = t1.remove("S"); 
				System.out.println("Remove S = "+res.first+" , nb comparision = "+res.second);
				t1.Treedisplayinorder();
				System.out.println("-----------");
				t1.BSTdisplayinorder();*/
				
				// Test getLoc
				/*TreeLocatorMap<String> t1 = new TreeLocatorMap<String>();
				Location l1 = new Location(4,7);
				t1.add("F",l1 );
				l1 = new Location(5,7);
				t1.add("V",l1 );
				l1 = new Location(6,1);
				t1.add("K",l1 );
				l1 = new Location(4,3);
				t1.add("D",l1 );
				l1 = new Location(4,8);
				t1.add("O", l1);
				l1 = new Location(8,4);
				t1.add("U", l1);
				l1 = new Location(8,2);
				t1.add("V", l1);
				l1 = new Location(2,2);
				t1.add("Y", l1);
				l1 = new Location(6,1);
				t1.add("S", l1);
				l1 = new Location(6,3);
				t1.add("B", l1);
				t1.BSTdisplayinorder();
				System.out.println("-----");
				t1.Treedisplayinorder();
				Pair<Location, Integer> res = t1.getLoc("F");
				System.out.println("-----");
				System.out.println("Location F = "+res.first+" , nb comparision = "+res.second);
				res = t1.getLoc("S");
				System.out.println("-----");
				System.out.println("Location S = "+res.first+" , nb comparision = "+res.second);
				res = t1.getLoc("K");
				System.out.println("-----");
				System.out.println("Location K = "+res.first+" , nb comparision = "+res.second);
				res = t1.getLoc("A");
				System.out.println("-----");
				System.out.println("Location A = "+res.first+" , nb comparision = "+res.second);*/
		
		// Test getMap, getLocator, getAll
				/*TreeLocatorMap<String> t1 = new TreeLocatorMap<String>();
				Location l1 = new Location(4,7);
				t1.add("F",l1 );
				l1 = new Location(5,7);
				t1.add("V",l1 );
				l1 = new Location(6,1);
				t1.add("K",l1 );
				l1 = new Location(4,3);
				t1.add("D",l1 );
				l1 = new Location(4,8);
				t1.add("O", l1);
				l1 = new Location(8,4);
				t1.add("U", l1);
				l1 = new Location(8,2);
				t1.add("V", l1);
				l1 = new Location(2,2);
				t1.add("Y", l1);
				l1 = new Location(6,1);
				t1.add("S", l1);
				l1 = new Location(6,3);
				t1.add("B", l1);
				t1.BSTdisplayinorder();
				System.out.println("-----");
				t1.Treedisplayinorder();
				
				BST<String, Location> map = new BST<String, Location> ();
				map = (BST<String, Location>) t1.getMap();
				System.out.println("-----");
				map.displayinorder();
				
				TreeLocator<String> locator = new TreeLocator<String>();
				locator = (TreeLocator<String>) t1.getLocator();
				System.out.println("-----");
				locator.displayinorder();
				
				List<String> list = new LinkedList<String>();
				list = t1.getAll();
				System.out.println("-----");
				if(list.empty())
					System.out.println("Empty list");
				else {
					list.findFirst();
					while(!list.last()) {
						System.out.print(list.retrieve()+", ");
						list.findNext();
					}
					System.out.print(list.retrieve());
				}*/
		
				
		//Test move
				/*TreeLocatorMap<String> t1 = new TreeLocatorMap<String>();
				Location l1 = new Location(4,7);
				t1.add("F",l1 );
				l1 = new Location(5,7);
				t1.add("V",l1 );
				l1 = new Location(6,1);
				t1.add("K",l1 );
				l1 = new Location(4,3);
				t1.add("D",l1 );
				l1 = new Location(4,8);
				t1.add("O", l1);
				l1 = new Location(8,4);
				t1.add("U", l1);
				l1 = new Location(8,2);
				t1.add("V", l1);
				l1 = new Location(2,2);
				t1.add("Y", l1);
				l1 = new Location(6,1);
				t1.add("S", l1);
				l1 = new Location(6,3);
				t1.add("B", l1);
				t1.BSTdisplayinorder();
				t1.Treedisplayinorder();
				 l1 = new Location (2,1);
				t1.move("A", l1);
				System.out.println("-----");
				t1.BSTdisplayinorder();
				t1.Treedisplayinorder();
				 l1 = new Location (2,1);
					t1.move("O", l1);
					System.out.println("-----");
					t1.BSTdisplayinorder();
					t1.Treedisplayinorder();*/

	}

}
