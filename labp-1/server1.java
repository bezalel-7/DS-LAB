import java.io.*;
import java.net.*;

public class server1 {
    public static void main(String[] args) throws Exception {
        System.out.println("wating for clients");
        ServerSocket ss = new ServerSocket(3333);
        Socket s = ss.accept();
        System.out.println("connection eastablished");
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str = br.readLine();
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        out.println("The server says" + str);
    }
}


python -c "
import csv, os
from openpyxl import Workbook
from openpyxl.styles import Font

wb = Workbook()
ws1 = wb.active
ws1.title = 'Top5'
ws1.append(['Country','Date','Magnitude','Depth_km','Place'])

data = [
['Japan','2015-05-30',7.8,664.0,'Bonin Islands, Japan region'],
['Japan','2015-05-12',6.8,35.0,'32 km SE of ?funato, Japan'],
['Japan','2015-02-16',6.7,23.0,'83 km ENE of Miyako, Japan'],
['Japan','2015-11-13',6.7,12.0,'140 km WSW of Makurazaki, Japan'],
['Japan','2015-06-23',6.5,460.0,'Bonin Islands, Japan region'],
['Chile','2015-09-16',8.3,22.44,'48 km W of Illapel, Chile'],
['Chile','2015-09-16',7.0,28.41,'25 km WNW of Illapel, Chile'],
['Chile','2015-11-11',6.9,12.0,'81 km NW of Coquimbo, Chile'],
['Chile','2015-11-11',6.9,10.0,'85 km NW of Coquimbo, Chile'],
['Chile','2015-11-07',6.8,46.0,'39 km SW of Ovalle, Chile'],
]
for row in data:
    ws1.append(row)

ws2 = wb.create_sheet('Summary')
ws2.append(['Metric','Japan','Chile'])
ws2.append(['Total Earthquakes (M>=5.0)',101,165])
ws2.append(['Earthquakes M5.0-5.9',86,139])
ws2.append(['Earthquakes M6.0-6.9',14,24])
ws2.append(['Earthquakes M7.0-7.9',1,1])
ws2.append(['Earthquakes M8.0+',0,1])
ws2.append(['Largest Magnitude',7.8,8.3])

path = os.path.join(os.path.expanduser('~'),'Desktop','japan_chile_seismicity_2015.xlsx')
wb.save(path)
print('Saved to', path)
"
