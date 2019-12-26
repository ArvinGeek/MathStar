package com.adc.medias;
import java.io.File;
import it.sauronsoftware.jave.AudioAttributes;
import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.EncoderException;
import it.sauronsoftware.jave.VideoAttributes;
import it.sauronsoftware.jave.VideoSize;
import it.sauronsoftware.jave.EncodingAttributes;
import it.sauronsoftware.jave.InputFormatException;
import it.sauronsoftware.jave.MultimediaInfo;

public class MediaConvert {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(" Hello Java !");
		MediaConvert MC=new MediaConvert();
		//MC.AviToMp4("F:\\MediaDesign\\Temp\\001.m4a","F:\\MediaDesign\\Temp\\001.mp3");
		//MC.AviToMp4("F:\\MediaDesign\\Temp\\Test.AVI","F:\\MediaDesign\\Temp\\Test.MKV");
		MC.AviConvertMKV();
		System.out.println(" ReName Success ! ");		
	}

	public void AviConvertMKV()  {
		File source = new File("F:\\MediaDesign\\Temp\\Test.AVI");
        File target = new File("F:\\MediaDesign\\Temp\\Test.MP4");
        try {

            AudioAttributes audio = new AudioAttributes();
            audio.setCodec("libmp3lame");
            audio.setBitRate(new Integer(56000));
            audio.setChannels(new Integer(1));
            audio.setSamplingRate(new Integer(22050));
            VideoAttributes video = new VideoAttributes();
            video.setCodec("mpeg4");
            video.setBitRate(new Integer(800000));
            video.setFrameRate(new Integer(15));
            EncodingAttributes attrs = new EncodingAttributes();
            attrs.setFormat("mp4");
            attrs.setAudioAttributes(audio);
            attrs.setVideoAttributes(video);
            Encoder encoder = new Encoder();
            encoder.encode(source, target, attrs);
        } catch (EncoderException e) {
            e.printStackTrace();
        }
		/*
		 * File source = new File("source.avi"); File target = new File("target.3gp");
		 */
		/*
		 * AudioAttributes audio = new AudioAttributes(); audio.setCodec("libfaac");
		 * audio.setBitRate(new Integer(128000)); audio.setSamplingRate(new
		 * Integer(44100)); audio.setChannels(new Integer(2)); VideoAttributes video =
		 * new VideoAttributes(); video.setCodec("mpeg4"); video.setBitRate(new
		 * Integer(160000)); video.setFrameRate(new Integer(15)); video.setSize(new
		 * VideoSize(176, 144)); EncodingAttributes attrs = new EncodingAttributes();
		 * attrs.setFormat("MP4"); attrs.setAudioAttributes(audio);
		 * attrs.setVideoAttributes(video); Encoder encoder = new Encoder(); try {
		 * //logger.info("avi转MP4 --- 转换开始:"+new Date()); encoder.encode(source, target,
		 * attrs); //logger.info("avi转MP4 --- 转换结束:"+new Date()); } catch
		 * (IllegalArgumentException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } catch (InputFormatException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); } catch (EncoderException e)
		 * { // TODO Auto-generated catch block e.printStackTrace(); }
		 */        
	}
	



	public  void AviToMp4(String oldPath,String newPath) {
//			File source = new File("C:\\shiping\\1.avi");
//		    File target = new File("C:\\shiping\\2019-06-27333333测试.mp4");
			File source = new File(oldPath);
		    File target = new File(newPath);
/*		    logger.info("转换前的路径:"+oldPath);
		    logger.info("转换后的路径:"+newPath);
*/		    
		    AudioAttributes audio = new AudioAttributes(); 
			audio.setCodec("libmp3lame"); //音频编码格式
			audio.setBitRate(new Integer(800000));
			audio.setChannels(new Integer(1)); 
			//audio.setSamplingRate(new Integer(22050)); 
			VideoAttributes video = new VideoAttributes(); 
			video.setCodec("libx264");//视频编码格式
			video.setBitRate(new Integer(3200000));
			video.setFrameRate(new Integer(15));//数字设置小了，视频会卡顿
			EncodingAttributes attrs = new EncodingAttributes(); 
			attrs.setFormat("MKV");
			attrs.setAudioAttributes(audio); 
			attrs.setVideoAttributes(video); 
			Encoder encoder = new Encoder();  
			//MultimediaInfo multimediaObject = new MultimediaInfo();
			//multimediaObject.getFormat();
			//encoder
			//MultimediaInfo.
			try {
				//logger.info("avi转MP4 --- 转换开始:"+new Date());
				encoder.encode(source, target, attrs);
				//logger.info("avi转MP4 --- 转换结束:"+new Date());
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InputFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (EncoderException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

}
