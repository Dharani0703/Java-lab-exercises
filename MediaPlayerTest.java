package Interface;

import java.util.ArrayList;

interface Playable {
 void play();
 void pause();
 void stop();
}

class MusicPlayer implements Playable {
 @Override
 public void play() {
     System.out.println("Music is playing.");
 }

 @Override
 public void pause() {
     System.out.println("Music is paused.");
 }

 @Override
 public void stop() {
     System.out.println("Music has stopped.");
 }
}

class VideoPlayer implements Playable {
 @Override
 public void play() {
     System.out.println("Video is playing.");
 }

 @Override
 public void pause() {
     System.out.println("Video is paused.");
 }

 @Override
 public void stop() {
     System.out.println("Video has stopped.");
 }
}

public class MediaPlayerTest {
 public static void main(String[] args) {
     ArrayList<Playable> mediaPlayers = new ArrayList<>();

     mediaPlayers.add(new MusicPlayer());
     mediaPlayers.add(new VideoPlayer());

     for (Playable player : mediaPlayers) {
         player.play();
         player.pause();
         player.stop();
         System.out.println();
     }
 }
}
