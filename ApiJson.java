package data.api.json;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiJson {
	public static void main(String[] args) {
		
		// ���� �̿� : BufferedReader --> ���۸� �̿��ؼ� �а� ���� �Լ�.
		// ����(Buffer) : ����� �ӵ� ����� ���ؼ� �����͸� �Ͻ������� �޸� ������ �� ���� ��Ƶδ� ��.
		// ���� ���� : ���۸� �̿��ϱ� ������ ����� ���� ó���۾��� �ſ� ������ �� �� �ִ�.
		BufferedReader br = null;		// Ctrl + shift + o�� ������ �ڵ����� ���� import
		try {
			
			// ���� API ����Ű �� ��ü Ǯ �ּ�
			// ������ ���� ���� �־ �ּ� ü�踦 ������ �Ѵٸ� --> StringBuilder�� ���.
			// String: �Һ�(immutable)���� �����Ƿ� ���ڿ��� ���� �� �Ź� ���ο� ��ü�� �����ؼ� �����ϴ� ��� --> �� ����x.
			// StringBuilder : ���ڿ��� ���� ���� �� ���ο� ��ü�� �Ź� �����ϴ� ���� �ƴ϶� ���� �����Ϳ� �߰��ذ��� ���. �ӵ��� ������.
			//				 : mutable �Ӽ��̰�, append(), insert(), delete() ���� ����ؼ� ���� ����.
			// ���� ���� API ��� --> StringBuilder ���.
			String urlStr ="http://apis.data.go.kr/B552061/jaywalking/getRestJaywalking?serviceKey=3OV9AWAJeu0xZpMYtAEE4n9ALJxdXVbHzzrzdW1W%2BeQxc6O0nCihEK90fEg2%2BlBuLY%2BOwQQZTV6OXgFzcBKfFQ%3D%3D&searchYearCd=2017&siDo=11&guGun=680&type=json&numOfRows=10&pageNo=1";
			
			// URL Ŭ������ ��ü ���� --> 2���� ��� : ������, �����
			URL url = new URL(urlStr);
			
			// openConnection() �޼��带 �̿��� ����
			// URL �ּ��� ���� ��ü�� ������ �� --> ����� �� �ִ� URLConnection ��ü ����.
			HttpURLConnection urlConn = (HttpURLConnection)url.openConnection();
			urlConn.setRequestMethod("GET");
			urlConn.setRequestProperty("Content-type", "application/json");
			System.out.println("Response code:" + urlConn.getResponseCode()); // 200
			
			// InputStreamReader Ŭ������ �б�
			// BufferedReader�� InputStreamReader�� ��ü�� �Է°����� ���.
			br = new BufferedReader(new InputStreamReader(urlConn.getInputStream(), "UTF-8"));
			
			
			// ��� ����
			/*
			String rst="";
			String line;
			while((line = br.readLine())!=null) {
				rst += line + "\n";
			}
			System.out.println(rst);
			*/
			
			StringBuilder sb = new StringBuilder ();
			String line;
			while ((line = br.readLine())!= null) {
				sb.append(line);
				}
			System.out.println(sb.toString());
			
			// ���� ����
			br.close();
			urlConn.disconnect();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
