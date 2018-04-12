package com.creating.www.project;

import java.io.Serializable;
import java.util.Date;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;


/**
 * 处理后的告警对象
 * @author Administrator
 *
 */
public class AlarmModel implements Delayed,Serializable {
	/**
	 * 序列化标识
	 */
	private static final long serialVersionUID = 1L;
	public Integer id;//用于生成Hash值
	public String objectId;//机盘号
	public String lineId;//机盘端口号
	public String alarmCode;//告警码
	public String bussinessId;//电路号
	public Date occurtime;//最近发生时间
	public String topBussinessId;//最高层电路号
	public String key;//key
	public long recieveTime;//接收时间 单位ms
	public boolean wait = false;//判断告警是门限时间内还是单纯等待
	public boolean special = false;//判断告警是否特殊告警
	public boolean descend = false;//是否衍生告警
	public AlarmModel(){}//无参默认构造器
	/**
	 * 替换id,objectId,alarmCode,lineId,occurtime,recive 
	 * */
	public AlarmModel(AlarmModel alarmModel){
		this.id = alarmModel.id;
		this.objectId = alarmModel.objectId;
		this.alarmCode = alarmModel.alarmCode;
		this.lineId = alarmModel.lineId;
		this.occurtime = alarmModel.occurtime;
		this.recieveTime = alarmModel.recieveTime;
	}
	public AlarmModel(int id,String objectId,String lineId,String alarmCode,String bussinessId,Date occurtime){
		this.id=id;
		this.objectId = objectId;
		this.alarmCode = alarmCode;
		this.bussinessId = bussinessId;
		this.lineId = lineId;
		this.occurtime = occurtime;
	}
	
	public AlarmModel(String objectId,String lineId,String alarmCode,String bussinessId,Date occurtime){
		this.objectId = objectId;
		this.alarmCode = alarmCode;
		this.bussinessId = bussinessId;
		this.lineId = lineId;
		this.occurtime = occurtime;
	}

	public AlarmModel(String objectId, long recieveTime){
		this.objectId = objectId;
		this.recieveTime = recieveTime;
	}
	
	@Override
	public String toString() {
		return "AlarmModel [id="+id+", objectId=" + objectId + ", lineId=" + lineId
				+ ", alarmCode=" + alarmCode + ", bussinessId=" + bussinessId
				+ ", occurtime=" + occurtime + ", topBussinessId="
				+ topBussinessId + ", key=" + key + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AlarmModel other = (AlarmModel) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id) ||!topBussinessId.equals(other.topBussinessId))
			return false;
		return true;
	}

	@Override
	public int compareTo(Delayed o) {
		// TODO Auto-generated method stub
		AlarmModel alarmModel = (AlarmModel) o;
		return (int) (this.recieveTime - alarmModel.recieveTime);
	}

	@Override
	public long getDelay(TimeUnit unit) {
		// TODO Auto-generated method stub
		return 1;}
}
