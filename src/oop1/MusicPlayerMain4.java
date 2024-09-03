package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {  //절차 지향코드 - 순서에 맞춰서 작성한 코드임
        MusicPlayer player= new MusicPlayer();
        //음악 플레이어를 켜기
        player.on();
        //볼륨을 증가
        player.volumeUp();
        //볼륨 증가
        player.volumeUp();
        //볼륨 감소
        player.volumeDown();
        //음악 플레이어 상태
        player.showStatus();
        //음악 플레이어 끄기
        player.off();

    }
}
