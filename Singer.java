class Singer {

    String[] singers;
    int currentIndex = 0;

    void storeSinger(String singerName) {

        System.out.println("Running storeSinger in Singer class");
        System.out.println("singerName:" + singerName);

        if (this.singers != null) {
			System.out.println("Array is not null");
			
            if (currentIndex < singers.length) {
                System.out.println("Index is within array length");
				
                singers[currentIndex] = singerName;
                System.out.println(singerName + " stored at index " + currentIndex);
                currentIndex++;
				
                System.out.println("Next index value is: " + currentIndex);
            } 
			
            else {
                System.out.println("Array is full");
            }
        } 
        else {
            System.out.println("Array is null");
        }
    }
}