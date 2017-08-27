package util;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import entity.Data;

public class DataTypeAdapter extends TypeAdapter {

  @Override
  public Data read(final JsonReader in) throws IOException {
    final Data data = new Data();

    in.beginObject();
    while (in.hasNext()) {
      switch (in.nextName()) {
      case "id":
      //  data.setId(in.nextInt());
        break;
      case "name":
        data.setName(in.nextString());
        break;
       }
    }
    in.endObject();

    return data;
  }
/*
  @Override
  public void write(final JsonWriter out, final Data data) throws IOException {
    out.beginObject();
    out.name("id").value(data.getId());
    out.name("name").value(data.getName());
    out.endObject();
  }
*/
  
@Override
public void write(JsonWriter arg0, Object arg1) throws IOException {
	// TODO Auto-generated method stub
	
}

}