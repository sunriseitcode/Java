# Mysql
mysql 函数
  时间日期函数
    日期、时间
      now() --获取当前日期和时间
      curdate() --获取当前日期
      curtime() --获取当前时间
      utc_date() --utc标准时间的日期
      utc_time() --utc标准时间的时间
     时、分、秒、月、年
      hour()、minute()、second()、month()、year()
     转换时间戳
      unix_timestamp() --以unix形式将当前时间转换成时间戳
      unix_timestamp(date) --以unix形式将date转换成时间戳
      from_unixtime(timestamp) --将时间戳转换为普通格式的时间
     计算时间、日期函数
      date_add(date, interval expr type) --在date上距离expr type个单位的时间
      date_sub(date, interval expr type) --在date上距离expr type个单位的时间
     
   字符串函数
    
   
