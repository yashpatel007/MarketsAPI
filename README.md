# MarketAPI
This project focus on building an API to get realtime gold prices from [cnbc.com/us-markets](https://www.cnbc.com/us-markets),
Besides getting the realtime data one can also search from old datapoints. Other features are constantly being added. If you like my work please 
support this by giving a star.


### How to Run the project
This project is builded using Java Spring framework make sure you have maven installed on your machine. If you do not have maven you can see 
how to install maven [here](https://maven.apache.org/install.html).
  * Using Maven
  Open cmd into the project folder containing pom.xml and then type
  ```cmd
  >> make all
  ```
  * Using Jar
  Navigae to [target](https://github.com/yashpatel007/MarketsAPI/tree/master/target) folder and open cmd there then type
  ```cmd
  >> make all
  ```
  
  
### API Features
  * **Get Current Market Snapshot**
      * [localhost:8080/market](http://localhost:8080/market)
  * **Get Past Datapoints By Name**
      * [localhost:8080/market/name/{name}](http://localhost:8080/market/NASDAQ), Get the Past data for NASDAQ
      
      * All other acessible names are 
          * **DIJA**      : Dow Jones Industrial Average 
          * **NASDAQ**    : NASDAQ Composite
          * **S&P500**    : S&P 500 Index
          * **GOLD**      : Gold COMEX (Jun'20)
          * **OIL**       : WTI Crude (Jun'20)
          * **EUR-USD**   : EUR/USD
          * **VIX**       : CBOE Volatility Index
          * **NYSE**      : NYSE Composite
          * **RUSS**      : Russell 2000 Index
          * **SILVER**    : Silver COMEX (Jul'20)
          
      
      
