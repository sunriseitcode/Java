# Java IO流

## File类使用

### 常用构造器

```java
public File(String pathname)//相对或绝对路径
public File(String parent,String child)
public File(File parent,String child)    
```

### 路径分隔符

```java
//动态分隔符
public static final String separator
```

### 常用方法

```java
//获取
//绝对路径
public String getAbsolutePath()
//获取上层文件目录路径
public String getParent()
    
//判断
//是否文件目录
public boolean isDirectory()
//是否为文件
public boolean isFile()
//是否存在
public boolean exists() 

//创建
//创建文件
public boolean createNewFile()
//创建文件目录
public boolean mkdirs()

//删除
//删除（空）文件/夹
public boolean delete()    
```

## Java IO流原理、分类

### 原理

```java
处理设备间，网络传输的数据传输
java语言以“流”的方式进行
通过标准方法输入输出数据    
```

### 分类

```java
//按数据单位
字节流（8bit），字符流（16bit）
//按流向
输入流，输出流
//按角色
节点流，处理流    
```

```java
//InputStream
//方法
int read()
int read(byte[] b)
int read(byte[] b,int off,int len)
public void close() throws IOException    
```

```java
//Reader
//方法
int read()
int read(char[] cbuf)
int read(char[] cbuf,int off,int len)
public void close() throws IOException    
```

```java
//OutputStream
void write(int b)
void write(byte[] b)
void write(byte[] b,int off,int len)
public void flush() throws IOException
public void close() throws IOException
```

```java
//Writer
void write(int c)
void write(char[] cbuf)
void write(char[] cbuf,int off,int len)
void write(String str)
void write(String str,int off,int len)
void flush()
public void close() throws IOException
```

## 节点流（文件流）

```java
写入文件，使用FileOutputStream(file)同名文件将被覆盖，FileOutputStream(file,true)则不会，在文件末尾追加内容        
```

## 缓冲流

```java
//提高数据读写速度
//分类
字节：BufferedInputStream和BufferedOutputStream
字符：BufferedReader和BufferedWriter 
//flush可强制将缓冲区内容全部写入输出流    
```

## 转换流

```java
//InputStreamReader：InputStream转为Reader
将字节的输入流按指定字符集转为字符的输入流
public InputStreamReader(InputStream in)
public InputSreamReader(InputStream in,String charsetName)
```

```java
//OutputStreamWriter:Writer转为OutputStream
将字符的输出流按指定字符集转为字节的输出流
public OutputStreamWriter(OutputStream out)
public OutputSreamWriter(OutputStream out,String charsetName)
```

## 标准输入/输出流

```java
System.in和System.out，默认键盘和显示器
```

## 打印流

```java
//将基本数据类型转为字符串输出
分为PrintStream和PrintWriter
```

## 数据流

```java
//分类
DataInputStream和DataOutputStream
```

## 对象流

```java
//分为ObjectInputStream和ObjectOutputStream
它们不能序列化static和transient修饰的成员变量
```

```java
//对象序列化
可将任何实现了Serializable接口的对象转为字节数据;   保证可序列化须实现Serializable或Externalizable两个接口之一 
```

## 随机存取文件流

```java
//RandomAccessFile类
//构造器
//mode有：r只读、rw打开读取写入、rwd打开读取写入并同步内容、rws打开读取写入并同步内容和元数据更新
public RandomAccessFile(File file, String mode) 
public RandomAccessFile(String name, String mode)
```

## NIO.2中Path、Paths、Files类使用

```java
//Path类
//获取Path对象
static Path get(String first, String...more)
static Path get(URI uri)
    
//常用方法
Path toAsolutePath()作为绝对路径返回调用Path对象 File toFile()将Path转为File类的对象   
```

```java
//Files类
//常用方法
//创建目录
Path createDirectory(Path path, FileAttribute<?>...arr)
//创建文件
Path createFile(Path path, FileAttribute<?> … arr) 
//Path对应的目录/文件存在则删除
void deleteIfExists(Path path)
//返回path指定的文件大小
long size(Path path)
```


