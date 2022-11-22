<template>
  <el-dialog :visible.sync="visibleSelect" width="35%" :modal="false" :title="$t('tenant.switch')" :close-on-click-modal="false" :close-on-press-escape="false">
    <div>
      <el-form :inline="true" size="mini" :model="dataForm" @keyup.enter.native="getDataList()">
        <el-form-item>
          <el-input v-model="dataForm.tenantCode" :placeholder="$t('tenant.tenantCode')" clearable></el-input>
        </el-form-item>
        <el-form-item>
          <el-input v-model="dataForm.tenantName" :placeholder="$t('tenant.tenantName')" clearable></el-input>
        </el-form-item>
        <el-form-item>
          <el-button @click="getDataList()">{{ $t('query') }}</el-button>
        </el-form-item>
      </el-form>
      <el-table
        v-loading="dataListLoading"
        :data="dataList"
        highlight-current-row
        border
        @current-change="currentChangeHandle"
        style="width: 100%;" size="mini">
        <el-table-column prop="tenantCode" :label="$t('tenant.tenantCode')" header-align="center" align="center"></el-table-column>
        <el-table-column prop="tenantName" :label="$t('tenant.tenantName')" header-align="center" align="center"></el-table-column>
        <el-table-column prop="status" :label="$t('tenant.status')" header-align="center" align="center">
          <template slot-scope="scope">
            <el-tag v-if="scope.row.status === 0" size="small" type="danger">{{ $t('tenant.status0') }}</el-tag>
            <el-tag v-else size="small" type="success">{{ $t('tenant.status1') }}</el-tag>
          </template>
        </el-table-column>
      </el-table>
      <el-pagination
        :current-page="page"
        :page-sizes="[10, 20, 50, 100]"
        :page-size="limit"
        :total="total"
        layout="total, sizes, prev, pager, next, jumper"
        @size-change="pageSizeChangeHandle"
        @current-change="pageCurrentChangeHandle">
      </el-pagination>
    </div>
    <template slot="footer">
      <el-button type="default" @click="cancelHandle()" size="mini">{{ $t('cancel') }}</el-button>
      <el-button type="primary" @click="commitHandle()" size="mini">{{ $t('confirm') }}</el-button>
    </template>
  </el-dialog>
</template>

<script>
import Cookies from 'js-cookie'
import mixinViewModule from '@/mixins/view-module'
export default {
  mixins: [mixinViewModule],
  data () {
    return {
      visibleSelect: false,
      currentRow: null,
      mixinViewModuleOptions: {
        getDataListURL: '/sys/tenant/page',
        getDataListIsPage: true
      },
      dataForm: {
        sysTenant: 0,
        tenantCode: '',
        tenantName: ''
      }
    }
  },
  methods: {
    init () {
      this.visibleSelect = true
      this.$nextTick(() => {
        this.getDataList()
      })
    },
    currentChangeHandle (val) {
      this.currentRow = val
    },
    cancelHandle () {
      this.visibleSelect = false
    },
    commitHandle () {
      if (!this.currentRow) {
        this.$message.error(this.$t('tenant.select'))
      } else {
        Cookies.set('tenantCode', this.currentRow.tenantCode)
        window.location.reload()
      }
    }
  }
}
</script>

<style lang="scss">
    .aui-wrapper {
        .el-table th {
            background-color: #ffffff;
        }
    }
</style>
