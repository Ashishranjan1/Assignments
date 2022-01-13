class MusicGroup{

    private String musicGroupName;
    private String musicGroupAddress;

    private Musician musician;

    public MusicGroup(String musicGroupName, String musicGroupAddress) {
        this.musicGroupName = musicGroupName;
        this.musicGroupAddress = musicGroupAddress;
    }
 
    public void employeeAnMusician(Musician musician) {
        this.musician=musician;
    }

    public void program() {
        System.out.println("musicGroupName: "+ musicGroupName);
        System.out.println("musicGroupAddress: "+ musicGroupAddress);
        musician.perform();
    }

}