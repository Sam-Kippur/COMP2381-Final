package dataviewer1orig;

import java.util.TreeMap;

public class Database {
	private TreeMap<DataPoint,DataPoint> dataPoints;
	private String m_selectedCountry;
    private Integer m_selectedEndYear;
    private String m_selectedState;
    private Integer m_selectedStartYear;
    
    public Database(String country, String state, int start, int end) {
    	m_selectedCountry = country;
    	m_selectedState = state;
    	m_selectedStartYear = new Integer(start);
    	m_selectedEndYear =  new Integer(end);
    }
}
