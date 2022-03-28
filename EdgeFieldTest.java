import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EdgeFieldTest {
    EdgeField testObj;





@Before
	public void setUp() throws Exception {
		testObj = new EdgeField("1|Peter");
	}




    @Test
    //tests getting the num figure
    public void testGetNumFigure() {
		String opt1Str = System.getProperty("optionone");
		final long opt1;
		if (opt1Str == null) {
			opt1 = 1;
		}
		else {
			opt1 = Long.parseLong(opt1Str);
		}
		assertEquals("numFigure was intialized to 1 so it should be 1",(long)opt1,testObj.getNumFigure());
	}




    @Test
    //tests getting name
    public void testGetName(){
        assertEquals("Name was initialized to 'Peter'", "Peter", testObj.getName());
    }




    @Test
    //tests getting Table ID
    public void testGetTableID(){
        assertEquals("Table ID was initialized to 0", 0, testObj.getTableID());
    }




    @Test
    //tests setting Table ID to 1
    public void testSetTableIDSmall(){
        testObj.setTableID(1);
        assertEquals("Table ID was changed to 1", 1, testObj.getTableID());
    }



    @Test
    //tests setting Table ID to 99999
    public void testSetTableIDLarge(){
        testObj.setTableID(99999);
        assertEquals("Table ID was changed to 99999", 99999, testObj.getTableID());
    }





    @Test
    //tests getting the Table Bound
    public void testGetTableBound(){
        assertEquals("Table Bound was initialized to 0", 0, testObj.getTableBound());
    }




    @Test
    //tests setting Table Bound to 1
    public void testSetTableBoundSmall(){
        testObj.setTableBound(1);
        assertEquals("Table Bound was changed to 1", 1, testObj.getTableBound());
    }



    @Test
    //tests setting Table Bound to 99999
    public void testSetTableBoundLarge(){
        testObj.setTableBound(99999);
        assertEquals("Table Bound was changed to 99999", 99999, testObj.getTableBound());
    }




    @Test
    //tests getting the Field Bound
    public void testGetFieldBound(){
        assertEquals("Field Bound was initialized to 0", 0, testObj.getFieldBound());
    }





    @Test
    //tests setting Field Bound to 1
    public void testSetFieldBoundSmall(){
        testObj.setFieldBound(1);
        assertEquals("Field Bound was changed to 1", 1, testObj.getFieldBound());
    }




    @Test
    //tests setting Field Bound to 99999
    public void testSetFieldBoundLarge(){
        testObj.setFieldBound(99999);
        assertEquals("Field Bound was changed to 99999", 99999, testObj.getFieldBound());
    }




    @Test
    //Tests getting disallowNull
    public void testGetDisallowNull(){
        assertEquals("disallowNull was initialized to false", false, testObj.getDisallowNull());
    }



    @Test
    //Tests setting disallowNull to True
    public void testSetDisallowNull(){
        testObj.setDisallowNull(true);
        assertEquals("disallowNull was changed to true", true, testObj.getDisallowNull());
    }



    @Test
    //Tests getting isPrimaryKey
    public void testGetIsPrimaryKey(){
        assertEquals("isPrimaryKey was initialized to false", false, testObj.getIsPrimaryKey());
    }



    @Test
    //Tests setting isPrimaryKey to true
    public void testSetIsPrimaryKey(){
        testObj.setIsPrimaryKey(true);
        assertEquals("isPrimaryKey was change to true", true, testObj.getIsPrimaryKey());
    }





    @Test
    //Tests getting Default Value
    public void testGetDefaultValue(){
        assertEquals("defaultValue was initialized to \"\" ", false, testObj.getDefaultValue());
    }





    @Test
    //Tests setting Default Value to "Peter"
    public void testSetDefaultValue(){
        testObj.setDefaultValue("Peter");
        assertEquals("isPrimaryKey was changed to 'Peter'", "Peter", testObj.getDefaultValue());
    }





    @Test
    //Tests getting varcharValue
    public void testGetVarcharValue(){
        assertEquals("varcharValue was initialized to 1", 1, testObj.getVarcharValue());
    }





    @Test
    //Tests setting varcharValue to 80
    public void testSetVarcharValue(){
        testObj.setVarcharValue(80);
        assertEquals("varcharValue was changed to 80", 80, testObj.getVarcharValue());
    }



@Test
    //Tests getting dataType
    public void testGetDataType(){
        assertEquals("dataType was initialized to 0", 0, testObj.getDataType());
    }

    @Test
    //Tests setting dataType to 1
    public void testSetDataType(){
        testObj.setDataType(1);
        assertEquals("dataType was changed to 1", 1, testObj.getDataType());
    }

}
