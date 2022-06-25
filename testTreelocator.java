
public class testTreelocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*TreeLocator<String> t1 = new TreeLocator<String>();
		t1.displayinorder();
		
		
		Location l1 = new Location(4,7);
		int x = t1.add("F",l1 );
		System.out.println("Adding F, nb comparision = "+x);
		System.out.println("-------------------------");
		
		l1 = new Location(5,7);
		x = t1.add("V",l1 );
		System.out.println("Adding V, nb comparision = "+x);
		System.out.println("-------------------------");
		
		l1 = new Location(6,1);
		x = t1.add("K",l1 );
		System.out.println("Adding K, nb comparision = "+x);
		System.out.println("-------------------------");
		
		l1 = new Location(4,3);
		x = t1.add("D",l1 );
		System.out.println("Adding D, nb comparision = "+x);
		System.out.println("-------------------------");
		
		l1 = new Location(4,8);
		x = t1.add("O", l1);
		System.out.println("Adding O, nb comparision = "+x);
		System.out.println("-------------------------");
		
		l1 = new Location(8,4);
		x = t1.add("U", l1);
		System.out.println("Adding U, nb comparision = "+x);
		System.out.println("-------------------------");
		
		l1 = new Location(8,2);
		x = t1.add("V", l1);
		System.out.println("Adding V, nb comparision = "+x);
		System.out.println("-------------------------");
		
		l1 = new Location(2,2);
		x = t1.add("Y", l1);
		System.out.println("Adding Y, nb comparision = "+x);
		System.out.println("-------------------------");
		
		l1 = new Location(6,1);
		x = t1.add("S", l1);
		System.out.println("Adding S, nb comparision = "+x);
		System.out.println("-------------------------");
		
		
		l1 = new Location(6,3);
		x = t1.add("B", l1);
		System.out.println("Adding B, nb comparision = "+x);
		System.out.println("-------------------------");
		
		l1 = new Location(6,1);
		x = t1.add("S", l1);
		System.out.println("Adding S, nb comparision = "+x);
		System.out.println("-------------------------");
		
		
		t1.displayinorder();
		
		l1 = new Location(4,3);
		Pair<Boolean, Integer> res = t1.remove("D",l1);
		System.out.println("Remove D = "+res.first+" , nb comparision = "+res.second);
		
		l1 = new Location(4,3); 
		res = t1.remove("A",l1); //Test: incorrect data and the data in location is empty
		System.out.println("Remove A = "+res.first+" , nb comparision = "+res.second);
		
		l1 = new Location(6,3); //Test: incorrect location
		res = t1.remove("D",l1); 
		System.out.println("Remove D = "+res.first+" , nb comparision = "+res.second);
		
		l1 = new Location(2,2); 
		res = t1.remove("A",l1); //Test: incorrect data 
		System.out.println("Remove A = "+res.first+" , nb comparision = "+res.second);
		
		l1 = new Location(6,1);
		res = t1.remove("S", l1);
		System.out.println("Remove S = "+res.first+" , nb comparision = "+res.second);

		t1.displayinorder();*/
		
	/*	TreeLocator<String> t1 = new TreeLocator<String>();
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
		t1.displayinorder();
				
		List<Pair<Location, List<String>>> l = t1.getAll();
		l.findFirst();
		while(!l.last()) {
			System.out.print(l.retrieve().first); // print the location
			l.retrieve().second.findFirst();
			while(!l.retrieve().second.last()) {
				System.out.print(l.retrieve().second.retrieve()+","); // print the data in the list
				l.retrieve().second.findNext();
			}
			if(l.retrieve().second != null) // last node in second
				System.out.print(l.retrieve().second.retrieve());
			System.out.println();
			l.findNext();
		}
		// last Node
		System.out.print(l.retrieve().first);
		l.retrieve().second.findFirst();
		while(!l.retrieve().second.last()) {
			System.out.print(l.retrieve().second.retrieve());
			l.retrieve().second.findNext();
		}
		if(l.retrieve().second != null)
			System.out.print(l.retrieve().second.retrieve());
		
		/*TreeLocator<String> t1 = new TreeLocator<String>();
		t1.displayinorder();
		Location l1 = new Location(4,7);
		int x = t1.add("F",l1 );
		System.out.println("Adding F, nb comparision = "+x);
		System.out.println("-------------------------");
		l1 = new Location(5,7);
		x = t1.add("V",l1 );
		System.out.println("Adding V, nb comparision = "+x);
		System.out.println("-------------------------");
		l1 = new Location(6,1);
		x = t1.add("K",l1 );
		System.out.println("Adding K, nb comparision = "+x);
		System.out.println("-------------------------");
		l1 = new Location(4,3);
		x = t1.add("D",l1 );
		System.out.println("Adding D, nb comparision = "+x);
		System.out.println("-------------------------");
		l1 = new Location(4,8);
		x = t1.add("O", l1);
		System.out.println("Adding O, nb comparision = "+x);
		System.out.println("-------------------------");
		l1 = new Location(8,4);
		x = t1.add("U", l1);
		System.out.println("Adding U, nb comparision = "+x);
		System.out.println("-------------------------");
		l1 = new Location(8,2);
		x = t1.add("V", l1);
		System.out.println("Adding V, nb comparision = "+x);
		System.out.println("-------------------------");
		l1 = new Location(2,2);
		x = t1.add("Y", l1);
		System.out.println("Adding Y, nb comparision = "+x);
		System.out.println("-------------------------");
		l1 = new Location(6,1);
		x = t1.add("S", l1);
		System.out.println("Adding S, nb comparision = "+x);
		System.out.println("-------------------------");
		l1 = new Location(6,3);
		x = t1.add("B", l1);
		System.out.println("Adding B, nb comparision = "+x);
		System.out.println("-------------------------");
		l1 = new Location(6,1);
		x = t1.add("S", l1);
		System.out.println("Adding S, nb comparision = "+x);
		System.out.println("-------------------------");
		t1.displayinorder();
		l1 = new Location(6,1);
		Pair<List<String>, Integer> p = t1.get(l1);
		p.first.findFirst();
		while(!p.first.last()) {
			System.out.print(p.first.retrieve()+", ");
			p.first.findNext();
		}
		System.out.println(p.first.retrieve());*/
		
		/*TreeLocator<String> t1 = new TreeLocator<String>();
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
		t1.displayinorder();
		
		l1 = new Location(4,7);
		t1.remove("F", l1);
		t1.displayinorder();
		l1 = new Location(4,3);
		t1.remove("D",l1 );
		t1.displayinorder();
		l1 = new Location(6,1);
		t1.remove("K",l1 );
		t1.displayinorder();
		l1 = new Location(8,2);
		t1.remove("V",l1 );
		t1.displayinorder();
		System.out.println(" ");
		List<Pair<Location, List<String>>> l = t1.getAll();
		l.findFirst();
		while(!l.last()) {
			System.out.print(l.retrieve().first); // print the location
			l.retrieve().second.findFirst();
			if(!l.retrieve().second.empty())
			while(!l.retrieve().second.last()) {
				System.out.print(l.retrieve().second.retrieve()+","); // print the data in the list
				l.retrieve().second.findNext();
			}
			//if(l.retrieve().second != null) // last node in second
			if(!l.retrieve().second.empty())
				System.out.print(l.retrieve().second.retrieve());
			System.out.println();
			l.findNext();

		}
		// last Node
		System.out.print(l.retrieve().first);
		if(!l.retrieve().second.empty()) {
		//System.out.print(l.retrieve().first);
		l.retrieve().second.findFirst();
		
		while(!l.retrieve().second.last()) {
			System.out.print(l.retrieve().second.retrieve());
			l.retrieve().second.findNext();
		}
			System.out.print(l.retrieve().second.retrieve());
		}
		System.out.println(" ");
		System.out.println(" ");
		t1.displayinorder();*/
		
		

		/*TreeLocator<String> t1 = new TreeLocator<String>();
		t1.displayinorder();
		Location l1 = new Location(4,7);
		int x = t1.add("F",l1 );
		System.out.println("Adding F, nb comparision = "+x);
		System.out.println("-------------------------");
		l1 = new Location(5,7);
		x = t1.add("V",l1 );
		System.out.println("Adding V, nb comparision = "+x);
		System.out.println("-------------------------");
		l1 = new Location(6,1);
		x = t1.add("K",l1 );
		System.out.println("Adding K, nb comparision = "+x);
		System.out.println("-------------------------");
		l1 = new Location(4,3);
		x = t1.add("D",l1 );
		System.out.println("Adding D, nb comparision = "+x);
		System.out.println("-------------------------");
		l1 = new Location(4,8);
		x = t1.add("O", l1);
		System.out.println("Adding O, nb comparision = "+x);
		System.out.println("-------------------------");
		l1 = new Location(8,4);
		x = t1.add("U", l1);
		System.out.println("Adding U, nb comparision = "+x);
		System.out.println("-------------------------");
		l1 = new Location(8,2);
		x = t1.add("V", l1);
		System.out.println("Adding V, nb comparision = "+x);
		System.out.println("-------------------------");
		l1 = new Location(2,2);
		x = t1.add("Y", l1);
		System.out.println("Adding Y, nb comparision = "+x);
		System.out.println("-------------------------");
		l1 = new Location(6,1);
		x = t1.add("S", l1);
		System.out.println("Adding S, nb comparision = "+x);
		System.out.println("-------------------------");
		l1 = new Location(6,3);
		x = t1.add("B", l1);
		System.out.println("Adding B, nb comparision = "+x);
		System.out.println("-------------------------");
		l1 = new Location(6,1);
		x = t1.add("S", l1);
		System.out.println("Adding S, nb comparision = "+x);
		System.out.println("-------------------------");
		t1.displayinorder();
		
		Location lowerLeft = new Location (3,6);

		Location upperRight = new Location(5,8);
		Pair<List<Pair<Location, List<String>>>, Integer> p = t1.inRange(lowerLeft, upperRight);
		p.first.findFirst();
		if(p.first.empty())
			System.out.println("Empty");
		else {
		System.out.println(p.first.retrieve().first);
		while(!p.first.last()) {
			System.out.println(p.first.retrieve().second);
			p.first.findNext();
		}
		System.out.println(p.first.retrieve().second);
		}*/

	}

}
