package dp.structural.Adapter;

public class VlcPlayer implements AdvancedMediaPlayer{

	@Override
	public void playVlc(String fileName) {
		System.out.println("playing vlc : " + fileName);
	}

	@Override
	public void playMp4(String fileName) {
		// do nothing
	}
	

}
