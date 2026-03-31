class HybridRunner {
    public static void main(String[] args) {

        Surgeon surgeon = new Surgeon();
        surgeon.service();
        surgeon.treat();
        surgeon.surgery();

        Nurse nurse = new Nurse();
        nurse.service();
        nurse.assist();
    }
}