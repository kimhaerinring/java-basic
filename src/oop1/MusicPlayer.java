package oop1;

public class MusicPlayer {

    int volume = 0;
    boolean isOn =false;

    void  on(){
        isOn = true;
        System.out.println("뮤직 플레이어 ON");
    }
    void  off(){
        isOn = false;
        System.out.println("뮤직 플레이어 OFF");
    }
    void volumeUp(){
        volume++;
        System.out.println("음악 플레이어 볼륨:" + volume);
    }
    void volumeDown(){
        volume--;
        System.out.println("음악 플레이어 볼륨:" + volume);
    }
    void showStatus(){
        if(isOn){
            System.out.println("음익 플레이어 ON , 볼륨:"+volume);
        }else {
            System.out.println("음익 플레이어 OFF");
        }
    }
}
