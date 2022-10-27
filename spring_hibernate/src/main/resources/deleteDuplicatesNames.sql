select *
from employees
where id not in
      (
          select max(id)
          from employees
          group by name

      );

delete from employees
where id not in
      (
          select maxRecId from (select max(id) as maxRecId
                                from employees
                                group by name) as c
      );