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
		System.out.println("----------------");
    }
	
	boolean searchSinger(String searchName) {

        System.out.println("Running searchSinger in Singer class");
        System.out.println("Searching for: " + searchName);

        if (singers != null) {

            System.out.println("Array is not null, starting comparison");

            for (String singer : singers) {

                System.out.println("Comparing singer: " + singer + " with searchName: " + searchName);

                if (singer != null && singer == searchName) {
                    System.out.println("Match found: " + singer);
                    return true;
                }
                else {
                    System.out.println("No match for this singer");
                }
            }

            System.out.println("Singer not found in the array");
        } 
        else {
            System.out.println("Array is null");
        }

        return false;
    }
}