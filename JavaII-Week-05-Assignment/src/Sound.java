// Assignment Week 05 
/**
 * Class that represents a sound.  This class is used by the students
 * to extend the capabilities of SimpleSound. 
 * 
 * Copyright Georgia Institute of Technology 2004
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Sound extends SimpleSound
{
  
  /////////////// consructors ////////////////////////////////////
  
  /**
   * Constructor that takes a file name
   * @param fileName the name of the file to read the sound from
   */
  public Sound(String fileName)
  {
    // let the parent class handle setting the file name
    super(fileName);
  }
  
  /**
   * Constructor that takes the number of samples in
   * the sound
   * @param numSamples the number of samples desired
   */
  public Sound (int numSamples)
  {
    // let the parent class handle this
    super(numSamples);
  }
  
  /**
   * Constructor that takes the number of samples that this
   * sound will have and the sample rate
   * @param numSamples the number of samples desired
   * @param sampleRate the number of samples per second
   */
  public Sound (int numSamples, int sampleRate)
  {
    // let the parent class handle this
    super(numSamples,sampleRate);
  }
  
  /**
   * Constructor that takes a sound to copy
   */
  public Sound (Sound copySound)
  {
    // let the parent class handle this
    super(copySound);
  }
  
  ////////////////// methods ////////////////////////////////////
  
  // Assignment Week 05 
  
  /*************************************************
   * Task 1 : Increase volume method
   * using a for-each loop
   */
  // Task 1: write increaseVolume() using for-each loop
  // yes it should be removed for cleaner code.
  public void increaseVolume()
  {
	  SoundSample[] soundArray = this.getSamples();
	  
	  // for-each loop
	  for (SoundSample sample : soundArray)
	  {
		  // increase volume by multiplier of 2
		  sample.setValue(sample.getValue() * 2);
	  }
  }
  
  // demonstration of reuse or (better use of) code; learnt from your remarks in Assignment 3
  public void increaseVolume2()
  {
	  increaseVolume(2); 
  }
  
  public void increaseVolume(int multiplier)
  {
	  SoundSample[] soundArray = this.getSamples();
	  int value = 0;	  
	  
	  // for-each loop
	  for (SoundSample sample : soundArray)
	  {
		  // get sample rate
		  value = sample.getValue();
		  
		  // add multiplier
		  value = value * multiplier;

		  // Limiter function: apply limits to prevent clipping
		  if ( value > 32764 )	// don't go right to the limit 32767
		  {
			  // limit extreme +ve values
			  sample.setValue(32760);

		  }
		  else if ( value < -32764 )	// don't go right to the limit -32768
		  {
			  // limit extreme -ve values
			  sample.setValue(-32760);
		  }
		  else if(value < 32767 && value > -32768 )
		  {
			  // set acceptable values within audible limits
			  sample.setValue(value);
		  }

	  }

  }
  
  /*********************************************************
   * Task 2: halvePosDoubleNeg - halves the volume of positive 
   * values and doubles the volume of negative values
   */
  public void halvePosDoubleNeg()
  {
	  SoundSample[] soundArray = this.getSamples();
	  SoundSample sample = null;
	  int index = 0;
  
	  // loop through the wav file
	  while ( index < soundArray.length )
	  {
		  // create an array for the sound
		  sample = soundArray[index];
		  
		  // apply alterations +ve * 0.5 & -ve * 2
		  if ( sample.getValue() >= 0 )
		  {
			  // ------------debug code left in on purpose-----------
			  //System.out.print(sample.getValue() + "\t" + (int)(sample.getValue() * 0.5) + "\t\n");  
			  sample.setValue((int)(sample.getValue() * 0.5));
		  }
		  else if (sample.getValue() < 0)
		  {
			  // ------------debug code left in on purpose-----------
			  //System.out.print(sample.getValue() + "\t" + (sample.getValue() * 2) + "\t\n");		
			  sample.setValue(sample.getValue() * 2);
		  }
		  index++;  
	  }
}
  /************************************************
   * Task 3: Collage Methods
   * 
   * Make a mirror method
   * 
   */
  public void mirror(Sound source, int targetStart)
  {
	  int length = source.getLength();
	  int value = 0;

	  // loop from 0 to mirror point
	  for ( int i = 0; i < source.getLength(); i++)			
	  {
		  value = source.getSampleValueAt(i);
		  this.setSampleValueAt(targetStart + length - 1 - i, value);		
	  }
  }
  
	/*
	 * Create a Sound Clip
	 */
	public void clip(int start, int end)
	{
		// calculate the number of samples in the clip
		int lengthInSamples = end - start + 1;		
		Sound target = new Sound(lengthInSamples + start);	// hold clip

		// copy from start to end from source into target
		for ( int i = start; i <= end; i++)
		{

			target.setSampleValueAt(i, this.getSampleValueAt(i));
			
		}
		
	}
	
	/*
	 * Clear the sound from a file to use as a blank slate
	 */
	
	public void clear()
	{
		SoundSample[] sourceArray = this.getSamples();
		
		for ( SoundSample sound : sourceArray )
		{
			sound.setValue(0);
		}
		
	}

	/*
	 * clipEdit: play only the supplied start and end points, and the
	 * target location
	 */
	public void clipEdit(Sound source, int sourceStart, int sourceStop, int targetStart)
	{
		// loop copying from source to target
		for ( int index = sourceStart, targetIndex = targetStart; 
				index < sourceStop && targetIndex < this.getLength(); 
				index++, targetIndex++)
		{
			this.setSampleValueAt(targetIndex, source.getSampleValueAt(index));
			
		}
	}
	
	/*
	 * Splicer, play the individual clips 
	 */
	public void splicer(Sound clip1, Sound clip2, Sound clip3)
	{
		

		// Helloworld.wav: "hello"
		clipEdit(clip1,2704,14892,0);
		
		// Helloworld.wav: "hello"
		clipEdit(clip1,2704,14892,14892); 
		
		// Helloworld.wav: "hello world"
		clipEdit(clip1,2704,35156,29784);
		
		// Thisisatest.wav: "this is a"
		clipEdit(clip2,0,43600, 62236);
		
		// fun.wav: "fun"
		clipEdit(clip3,0,11134,105836);
		
		// fun.wav: "nuf"
		mirror(clip3,116970);
		
		// Thisisatest.wav: "test"
		clipEdit(clip2,43600,60800,129715);
		
		
	}
	

  
  /**
   * Method to return the string representation of this sound
   * @return a string with information about this sound
   */
  public String toString()
  {
    String output = "Sound";
    String fileName = getFileName();
    
    // if there is a file name then add that to the output
    if (fileName != null)
      output = output + " file: " + fileName;
    
    // add the length in frames
    output = output + " number of samples: " + getLengthInFrames();
    
    return output;
  }
 
  public static void main(String[] args)
  {
	  
	
	/*
	 * Assignment 05:
	 * Create sound object for 3 tasks and assign a sound file to it 
	 */
	  
	  
	// General Setting Changes: change this for your own location to write the files to.
	String writeLocation = "/Users/Shared/Java-Libraries/CourseCD/results/";
	
	  
	/*
    // Task 1: increaseVolume + increaseVolume wit multiplication factor
	Sound soundTask1 = new Sound(FileChooser.getMediaPath("thisisatest.wav"));
	soundTask1.explore();
	soundTask1.increaseVolume2();	// not the best use of code, but here to demonstrate reuse of methods
	soundTask1.play();
	soundTask1.explore();
	soundTask1.write(writeLocation + "Assignment05-Task1.wav");
	*/
	  
	/*
	// Task 2: alter volume, +ve waveform increases by half, -ve waveform increases by 2.0
	// NB: I realize I could have created the limiter from above as a method and
	// reused it here, but I just ran out of time.
	Sound soundTask2 = new Sound(FileChooser.getMediaPath("thisisatest.wav"));
	soundTask2.explore();
	soundTask2.halvePosDoubleNeg();
	soundTask2.play();
    soundTask2.explore();
    soundTask2.write(writeLocation + "Assignment05-Task2.wav");
    */
	  
	/*
	 * Task 3: Make an audio collage;
	 * - at least 5 seconds long
	 * - at least 2 different sounds (from different files)
	 * - Make copy of one sound and mirror it
	 * - Splice together the original sounds and generate a single output file
	 * - write to disk
	 */
	 
	 /*
	  * Comments Notes, I moved the sound files here, thinking that
	  * this would be a more centralized location for re-using the splicer method
	  * but realized after that the splicer method contained such specific settings
	  * for the individual wave samples that this really defeats the purpose
	  * of reusing methods.
	  */
	  
	/*
	// Task 3  
    Sound task3Source = new Sound(FileChooser.getMediaPath("gettysburg.wav"));
    Sound clip1 = new Sound(FileChooser.getMediaPath("helloWorld.wav"));	
    Sound clip2 = new Sound(FileChooser.getMediaPath("thisisatest.wav"));
    Sound clip3 = new Sound(FileChooser.getMediaPath("fun.wav"));
		
    // create a blank soundscape
    task3Source.clear();
    
    // splice 3x clips
    task3Source.splicer(clip1, clip2, clip3);
    
    // play result
    task3Source.play();
    
    // write result to disk
    task3Source.write(writeLocation + "Assignment05-Task3.wav");
	*/
    
  }
             
} // this } is the end of class Sound, put all new methods before this