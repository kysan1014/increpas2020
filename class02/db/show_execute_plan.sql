CREATE TABLE PLAN_TABLE AS 
  SELECT STATEMENT_ID, 
         PLAN_ID, 
         TIMESTAMP, 
         REMARKS, 
         OPERATION, 
         OPTIONS, 
         OBJECT_NODE, 
         OBJECT_OWNER, 
         OBJECT_NAME, 
         OBJECT_ALIAS, 
         OBJECT_INSTANCE, 
         OBJECT_TYPE, 
         OPTIMIZER, 
         SEARCH_COLUMNS, 
         ID, 
         PARENT_ID, 
         DEPTH, 
         POSITION, 
         COST, 
         CARDINALITY, 
         BYTES, 
         OTHER_TAG, 
         PARTITION_START, 
         PARTITION_STOP, 
         PARTITION_ID, 
         TO_LOB(OTHER) AS OTHER, 
         OTHER_XML     AS OTHER_XML, 
         DISTRIBUTION, 
         CPU_COST, 
         IO_COST, 
         TEMP_SPACE, 
         ACCESS_PREDICATES, 
         FILTER_PREDICATES, 
         PROJECTION, 
         TIME, 
         QBLOCK_NAME 
  FROM   PLAN_TABLE
  
explain plan for
select * from emp;

select plan_table_output from table(dbms_xplan.display('plan_table',null,'all'));