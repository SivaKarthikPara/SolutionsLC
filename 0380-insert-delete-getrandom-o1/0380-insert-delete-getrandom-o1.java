class RandomizedSet {
    
    Set<Integer> randomSet;

    public RandomizedSet() {
        randomSet = new HashSet<>();
    }
    
    public boolean insert(int val) {
        if(randomSet.add(val) == false)
            return false;
        else
            randomSet.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(randomSet.contains(val))
            randomSet.remove(val);
        else
            return false;
        return true;
    }
    
    public int getRandom() {
        Integer[] arrayNumbers = randomSet.toArray(new Integer[randomSet.size()]);
        Random rndm = new Random();
        int rndmNumber = rndm.nextInt(randomSet.size());
        
        return arrayNumbers[rndmNumber]; //randomSet.stream().findAny().get();
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */