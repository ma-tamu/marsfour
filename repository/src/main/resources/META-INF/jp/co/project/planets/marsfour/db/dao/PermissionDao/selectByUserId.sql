SELECT
    permission.*
FROM
  permission
  LEFT OUTER JOIN role_permission on permission.id = role_permission.permission_id
  LEFT OUTER JOIN role on role.id = role_permission.role_id
  LEFT OUTER JOIN user_role on role.id = user_role.role_id
WHERE
  user_role.user_id = /*userId*/'a'
  AND role.is_deleted = 0
  AND permission.is_deleted = 0