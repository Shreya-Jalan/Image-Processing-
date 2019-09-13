# Image-Processing-

Image enhancement is enhancing the image to make the image more appealing.

It is used for:

•	Appealing the image
•	Removing noise
•	Identifying the ROI
•	Featuring in your image
•	Unwanted factors

It can be done by special domain and frequency domain.

It can be done by Contrast Stretching,Thresholding. Point Transformation:
•	Image negative
•	Log transform
•	Nth power
 
•	Nth root
•	Inverse log Piecewise Transform:
•	Contrast stretching
•	Gray level slicing
•	Bit Plane slicing

PROBLEM DEFINITON:

Image Negative: S=|L-1-r|

{DARKER<-> WHITER}

Log transform: S=C*log(1+r) Where C is from 1 to 9
{Brighten the darker part of image} Gamma correction: S=C*r^gamma Gamma<1: More white images Gamma>1:More darker images
Image averaging can be used for smoothening(blurring) the image. Low pass filter: Average filter
Weighted average filter

Statistical order filter: Max,Min,Median Sharpening:Edges will be detected perfectly Convolution
correlation
