package com.mooshmoosh.audioreviser;

public class AndroidAudioManagerMock extends AndroidAudioManager {

	public String AppFolder;
	
	public AndroidAudioManagerMock() {
		
	}
	
	public AndroidAudioManagerMock(String folder) {
		
	}
	
    public boolean createAppDirectory(String FolderName)
    {
    	return true;
    }
	
	public void beginRecordingAudio(String fname)
    {
    	
    }
    
    public void endRecordingAudio()
    {
    	
    }
    
    public int getRecordingDuration(String fname)
    {
		return 0;
    }
    
    public void PlayAudioFile(String fname)
    {
    	
    }
    
    public int getAudioPosition() {
    	return 0;
    }
    
    public void resumeAudioPlaybackAt(String fname, int time) {
    	
    }
    
    public void StopPlayingAudio()
    {
    	
    }
    
    public void PlayAudioFileVoice(String fname)
    {
    	
    }
    
    public void StopPlayingAudioVoice()
    {
    	
    }
	
    public void StopEverything()
    {
    	
    }
}
