package com.ontheroad.library;

import com.ontheroad.library.helpers.Mercator;

public class GPSCoordinates {
	public float Lat;
	public float Lon;
	
	public GPSCoordinates(float lat, float lon)
	{
		this.Lat = lat;
		this.Lon = lon;
	}
	
    public double getMercatorLatitude()
    {
      return Mercator.mercY(Lat);
    }
    
    public double getMercatorLongitude()
    {
      return Mercator.mercX(Lon);
    }
}
