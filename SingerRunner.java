public class SingerRunner {

    public static void main(String[] args) {

        Singer singer = new Singer();
        singer.singers = new String[50];   

        singer.storeSinger("Arijit Singh");
        singer.storeSinger("Shreya Ghoshal");
        singer.storeSinger("Sonu Nigam");
        singer.storeSinger("Neha Kakkar");
        singer.storeSinger("Atif Aslam");
        singer.storeSinger("KK");
        singer.storeSinger("Sunidhi Chauhan");
        singer.storeSinger("Armaan Malik");
        singer.storeSinger("Darshan Raval");
        singer.storeSinger("Jubin Nautiyal");

        singer.storeSinger("Lata Mangeshkar");
        singer.storeSinger("Asha Bhosle");
        singer.storeSinger("Kishore Kumar");
        singer.storeSinger("Mohammed Rafi");
        singer.storeSinger("Alka Yagnik");
        singer.storeSinger("Udit Narayan");
        singer.storeSinger("Sukhwinder Singh");
        singer.storeSinger("Kailash Kher");
        singer.storeSinger("Himesh Reshammiya");
        singer.storeSinger("Mika Singh");

        singer.storeSinger("Badshah");
        singer.storeSinger("Yo Yo Honey Singh");
        singer.storeSinger("Guru Randhawa");
        singer.storeSinger("Neeti Mohan");
        singer.storeSinger("Palak Muchhal");
        singer.storeSinger("Monali Thakur");
        singer.storeSinger("Kanika Kapoor");
        singer.storeSinger("Shilpa Rao");
        singer.storeSinger("Rahat Fateh Ali Khan");
        singer.storeSinger("Adnan Sami");

        singer.storeSinger("Lucky Ali");
        singer.storeSinger("Papon");
        singer.storeSinger("Benny Dayal");
        singer.storeSinger("Vishal Dadlani");
        singer.storeSinger("Shekhar Ravjiani");
        singer.storeSinger("Ankit Tiwari");
        singer.storeSinger("Mohit Chauhan");
        singer.storeSinger("Shaan");
        singer.storeSinger("Hariharan");
        singer.storeSinger("Jagjit Singh");

        singer.storeSinger("Sid Sriram");
        singer.storeSinger("Arunita Kanjilal");
        singer.storeSinger("Pawandeep Rajan");
        singer.storeSinger("Salman Ali");
        singer.storeSinger("Neha Bhasin");
        singer.storeSinger("Jonita Gandhi");
        singer.storeSinger("Amit Trivedi");
        singer.storeSinger("Divya Kumar");
        singer.storeSinger("Javed Ali");
        singer.storeSinger("Harshdeep Kaur");

        System.out.println("========== SEARCH ==========");
        singer.searchSinger("Sonu Nigam");

        System.out.println("========== UPDATE INDEX ==========");
        singer.updateSinger(1, "Shreya");

        System.out.println("========== UPDATE NAME ==========");
        singer.updateSinger("Arijit Singh", "Arijit");

        System.out.println("========== DELETE INDEX ==========");
        singer.deleteSinger(2);

        System.out.println("========== DELETE NAME ==========");
        singer.deleteSinger("Neha Kakkar");

        System.out.println("========== FINAL LIST ==========");
        for (String s : singer.singers) {
            System.out.println(s);
        }
    }
}