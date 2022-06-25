
public class TreeLocatorMap<K extends Comparable<K>> implements LocatorMap<K> {
	 Map<K , Location> map = new BST<K,Location>() ;
	 Locator<K> location = new TreeLocator<K>()  ;

	 
	 public TreeLocatorMap() {
		
	 }
	@Override
	public Map<K, Location> getMap() {
		// TODO Auto-generated method stub
		return map;
	}

	@Override
	public Locator<K> getLocator() {
		// TODO Auto-generated method stub
		return location;
	}

	@Override
	public Pair<Boolean, Integer> add(K k, Location loc) {
		// TODO Auto-generated method stub

		Pair<Boolean,Integer> find = map.find(k);
		Boolean found = find.first;
		Integer count = find.second;
		
		if(found) 
			return new Pair<Boolean,Integer>(false,count); 	
		
		map.insert(k, loc);
		location.add(k, loc);
		
		return new Pair<Boolean,Integer>(true,count);  
	}

	@Override
	public Pair<Boolean, Integer> move(K k, Location loc) {
		// TODO Auto-generated method stub
		Pair<Boolean,Integer> find = map.find(k);
		Boolean found = find.first;
		Integer count = find.second;
		
		if(found) {
			Location L = getLoc(k).first;
			if(L != null) {
			map.remove(k);
			location.remove(k, L);
			map.insert(k, loc);
			location.add(k, loc);
			return new Pair<Boolean,Integer> (true,count);
			}
		}
		
		return new Pair<Boolean,Integer> (false,count);
 
	}

	@Override
	
	public Pair<Location, Integer> getLoc(K k) {
		// TODO Auto-generated method stub
		Pair<Boolean,Integer> find = map.find(k);
		Boolean found = find.first;
		Integer count = find.second;
		
		
		if(found) {
			if(!map.empty()) {
			Pair<Location, Integer> result = new Pair<Location, Integer>(map.retrieve(),count);
			return result;
			}
		}
			
		
		return new Pair<Location,Integer>(null,count);
		
		
	}

	@Override
	public Pair<Boolean, Integer> remove(K k) {
		// TODO Auto-generated method stub
		Pair<Boolean,Integer> find = map.find(k);
		Boolean found = find.first;
		Integer count = find.second;
		
		if(found) {
			Location l = getLoc(k).first;
			if(l != null) {
			map.remove(k);
			location.remove(k,l);
			return new Pair<Boolean,Integer>(true,count);
			}

		}
			return new Pair<Boolean,Integer>(false,count); 	
		
	}	
	
	@Override
	public List<K> getAll() {
		// TODO Auto-generated method stub
		
		return map.getAll();
	}


	
	
	@Override
	public Pair<List<K>, Integer> getInRange(Location lowerLeft, Location upperRight) {
		// TODO Auto-generated method stub
		
		List<K> keys = new LinkedList<K>();
		
		Pair<List<Pair<Location,List<K>>>,Integer> result = location.inRange(lowerLeft, upperRight);
		
		
		List <Pair<Location,List<K>>> l = result.first;
		
		if(!l.empty()) {
			l.findFirst();
			while(!l.last()) {
				if(!l.retrieve().second.empty()) {
					l.retrieve().second.findFirst();
					while(!l.retrieve().second.last()) {
						keys.insert(l.retrieve().second.retrieve());
						l.retrieve().second.findNext();
					}
					keys.insert(l.retrieve().second.retrieve());
				}
				l.findNext();
			}
			
			if(!l.retrieve().second.empty()) {
				l.retrieve().second.findFirst();
				while(!l.retrieve().second.last()) {
					keys.insert(l.retrieve().second.retrieve());
					l.retrieve().second.findNext();
				}
				keys.insert(l.retrieve().second.retrieve());
			
		}
	}
		
		return new Pair<List<K>,Integer>(keys,result.second);
	

	}
}


/*	public void BSTdisplayinorder() {
map.displayinorder();
}
public void Treedisplayinorder() {
location.displayinorder();
}*/
