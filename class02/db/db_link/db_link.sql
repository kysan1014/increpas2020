
C:\app\db\product\11.2.0\dbhome_1\NETWORK\ADMIN\tnsnames.ora에

원격디비접속자 = 
  (DESCRIPTION = 
    (ADDRESS = 
      (PROTOCOL = TCP)
      (HOST = 대상 아이피)
      (PORT = 1521)
    )
    (CONNECT_DATA = 
      (SERVER = DEDICATED)
      (SERVICE_NAME = 대상 SID)
    )
  )

예 )
TLINK = 
  (DESCRIPTION = 
    (ADDRESS = 
      (PROTOCOL = TCP)
      (HOST = 192.168.0.21)
      (PORT = 1521)
    )
    (CONNECT_DATA = 
      (SERVER = DEDICATED)
      (SERVICE_NAME = orcl)
    )
  )
  
 디비 링크 생성
 
create public database link 디비링크 이름 connect to 대상 계정 아이디 identified by 대상 계정 비밀번호 using '원격디비접속자이름';
 
create public database link test_server connect to hello identified by hello using 'TLINK';

select * from member@test_server;