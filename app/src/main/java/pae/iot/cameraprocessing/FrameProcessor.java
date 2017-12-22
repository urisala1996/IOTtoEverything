package pae.iot.cameraprocessing;

import org.opencv.core.Core;
import org.opencv.core.Mat;

public class FrameProcessor {

    private Mat frame;

    public FrameProcessor(Mat frame) {
        this.frame = frame;
    }

    public FrameProcessor(){

    }

    public void calculateMean(Mat frame, Mat averageMat){
        Core.reduce(frame,averageMat,1, Core.REDUCE_AVG);

    }
}
