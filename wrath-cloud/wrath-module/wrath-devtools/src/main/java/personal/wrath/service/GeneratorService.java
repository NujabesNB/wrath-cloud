

package personal.wrath.service;

import personal.wrath.config.DataSourceInfo;
import personal.wrath.entity.MenuEntity;
import personal.wrath.entity.TableFieldEntity;
import personal.wrath.entity.TableInfoEntity;

import java.util.List;

/**
 * 代码生成
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface GeneratorService {

    DataSourceInfo getDataSourceInfo(Long datasourceId);

    void datasourceTable(TableInfoEntity tableInfo);

    void updateTableField(Long tableId, List<TableFieldEntity> tableFieldList);

    void generatorCode(TableInfoEntity tableInfo);

    void generatorMenu(MenuEntity menu);
}
