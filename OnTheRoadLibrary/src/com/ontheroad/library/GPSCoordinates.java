package com.ontheroad.library;

import com.ontheroad.library.helpers.Mercator;

public class GPSCoordinates {
	public double Lat;
	public double Lon;
	
	public GPSCoordinates(double lat, double lon)
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
