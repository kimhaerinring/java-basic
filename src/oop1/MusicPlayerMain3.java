package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {  //절차 지향코드 - 순서에 맞춰서 작성한 코드임
        MusicPlayerData data = new MusicPlayerData();

        //음악 플레이어를 켜기
        on(data);
        //볼륨을 증가
        volumeUp(data);
        //볼륨 증가
        volumeUp(data);
        //볼륨 감소
        volumeDown(data);
        //음악 플레이어 상태
        showStatus(data);
        //음악 플레이어 끄기
        off(data);

    }

    static void on(MusicPlayerData data) {
    //음악 플레이어를 켜기
    data.isOn =true;
    System.out.println("음악 플레이어를 시작합니다.");
    }
    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
    static void volumeUp(MusicPlayerData data){
        data.volume++;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }
    static void volumeDown(MusicPlayerData data){
        data.volume--;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }
    static void showStatus(MusicPlayerData data){
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
