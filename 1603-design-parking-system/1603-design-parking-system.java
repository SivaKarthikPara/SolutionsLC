class ParkingSystem {
    
    int bigCars;
    int mediumCars;
    int smallCars;

    public ParkingSystem(int big, int medium, int small) {
        this.bigCars = big;
        this.mediumCars = medium;
        this.smallCars = small;
    }
    
    public boolean addCar(int carType) {
        switch(carType){
            case 1: bigCars--;
                return bigCars>=0?true:false;
            case 2: mediumCars--;
                return mediumCars>=0?true:false;
            case 3: smallCars--;
                return smallCars>=0?true:false;
            default:
                return false;
        }
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */