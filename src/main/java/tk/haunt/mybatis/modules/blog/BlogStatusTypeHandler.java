package tk.haunt.mybatis.modules.blog;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedJdbcTypes(JdbcType.TINYINT)
@MappedTypes(BlogStatus.class)
public class BlogStatusTypeHandler extends BaseTypeHandler<BlogStatus> {
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, BlogStatus blogStatus, JdbcType jdbcType) throws SQLException {
        preparedStatement.setInt(i, blogStatus.ordinal());
    }

    @Override
    public BlogStatus getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return BlogStatus.values()[resultSet.getInt(s)];
    }

    @Override
    public BlogStatus getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return BlogStatus.values()[resultSet.getInt(i)];
    }

    @Override
    public BlogStatus getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return BlogStatus.values()[callableStatement.getInt(i)];
    }
}
