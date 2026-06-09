package _9_Adapter;

interface MediaPlayer{
    void play(String audioType, String fileName);
}

interface AdvancedMediaPlayer{
    void playVlc(String fileName);
    void playMp4(String fileName);
}

class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName){
        System.out.println("Playing Vlc: "+ fileName);
    }

    @Override
    public void playMp4(String fileName){
        // Not Supported
    }
}

class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName){
        // Not Supported
    }
    
    @Override
    public void playMp4(String fileName){
        System.out.println("Playing Mp4: "+ fileName);
    }
}

class MediaAdapter implements MediaPlayer{
    private AdvancedMediaPlayer advancedMediaPlayer;
    
    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer=new VlcPlayer();
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer=new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName){
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}

class AudioPlayer implements MediaPlayer{
    private MediaPlayer mediaPlayer;

    @Override
    public void play(String audioType, String fileName){
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing Mp3: "+fileName);
        }else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaPlayer=new MediaAdapter(audioType);
            mediaPlayer.play(audioType, fileName);
        }else{
            System.out.println("Unsupported format");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer=new AudioPlayer();

        audioPlayer.play("mp3","song.mp3");
        audioPlayer.play("vlc","video.vlc");
        audioPlayer.play("mp4","song.mp4");
    }
}
