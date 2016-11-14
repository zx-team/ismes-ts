package com.isesol.mes.ismes.ts.activity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.isesol.ismes.platform.module.Bundle;
import com.isesol.ismes.platform.module.Parameters;
import com.isesol.ismes.platform.module.Sys;
import com.isesol.mes.ismes.ts.constant.GzgjStateConstant;

public class SbgzbjActivity {
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private SimpleDateFormat sdf_time = new SimpleDateFormat("yyyy-MM-dd");
	private SimpleDateFormat sdf_hour = new SimpleDateFormat("HH:mm:ss");

	/**
	 * 初始化
	 * @param bundle
	 * @return
	 */
	public void homePageActivity(Bundle bundle) {
		Map<String, Object> returnmap = new HashMap<String, Object>();
		returnmap.put("picQd", Sys.getResourceUrl("ts", "qdbutton"));
		returnmap.put("picCz", Sys.getResourceUrl("ts", "czbutton"));
		returnmap.put("picFh", Sys.getResourceUrl("ts", "fhbutton"));
		bundle.put("pics", returnmap);
	}

	/**
	 * 获取物料接收
	 * @param parameters
	 * @param bundle
	 * @return
	 */
	public String getWljs(Parameters parameters, Bundle bundle) {
		homePageActivity(bundle);
		return "wljs";
	}

	/**
	 * 获取报工
	 * @param parameters
	 * @param bundle
	 * @return
	 */
	public String getBkg(Parameters parameters, Bundle bundle) {
		homePageActivity(bundle);
		return "bkg";
	}

	/**
	 * 获取工装报警
	 * @param parameters
	 * @param bundle
	 * @return
	 */
	public String getGzbj(Parameters parameters, Bundle bundle) {
		String picDj = Sys.getResourceUrl("ts", "dj");
		String picJj = Sys.getResourceUrl("ts", "jj");
		String picLj = Sys.getResourceUrl("ts", "lj");

		String picDj_bk = Sys.getResourceUrl("ts", "dj_bk");
		String picJj_bk = Sys.getResourceUrl("ts", "jj_bk");
		String picLj_bk = Sys.getResourceUrl("ts", "lj_bk");

		String picQd = Sys.getResourceUrl("ts", "qdbutton");
		String picCz = Sys.getResourceUrl("ts", "czbutton");
		String picFh = Sys.getResourceUrl("ts", "fhbutton");

		Map<String, Object> returnmap = new HashMap<String, Object>();

		returnmap.put("picQd", picQd);
		returnmap.put("picCz", picCz);
		returnmap.put("picFh", picFh);

		returnmap.put("picDj", picDj);
		returnmap.put("picJj", picJj);
		returnmap.put("picLj", picLj);

		returnmap.put("picDj_bk", picDj_bk);
		returnmap.put("picJj_bk", picJj_bk);
		returnmap.put("picLj_bk", picLj_bk);

		bundle.put("pics", returnmap);
		return "gzbj";
	}

	/**
	 * 获取第一页
	 * @param parameters
	 * @param bundle
	 * @return
	 */
	public String getFirstpage(Parameters parameters, Bundle bundle) {
		String picWlsd = Sys.getResourceUrl("ts", "wlsd");
		String picWljs = Sys.getResourceUrl("ts", "wljs");
		String picGzsd = Sys.getResourceUrl("ts", "gzsd");
		String picGzjs = Sys.getResourceUrl("ts", "gzjs");
		String picBkg = Sys.getResourceUrl("ts", "bkg");
		String picCkgy = Sys.getResourceUrl("ts", "ckgy");
		String picBg = Sys.getResourceUrl("ts", "bg");
		String picGzrk = Sys.getResourceUrl("ts", "gzrk");
		String picLjrk = Sys.getResourceUrl("ts", "ljrk");
		String picGzck = Sys.getResourceUrl("ts", "gzck");
		String picLjck = Sys.getResourceUrl("ts", "ljck");
		String picQlbj = Sys.getResourceUrl("ts", "qlbj");
		String picSbgz = Sys.getResourceUrl("ts", "sbgz");
		String picGzbj = Sys.getResourceUrl("ts", "gzbj");

		Map<String, Object> returnmap = new HashMap<String, Object>();
		returnmap.put("picBkg", picBkg);
		returnmap.put("picWlsd", picWlsd);
		returnmap.put("picWljs", picWljs);
		returnmap.put("picGzsd", picGzsd);
		returnmap.put("picGzjs", picGzjs);
		returnmap.put("picCkgy", picCkgy);
		returnmap.put("picBg", picBg);
		returnmap.put("picGzrk", picGzrk);
		returnmap.put("picLjrk", picLjrk);
		returnmap.put("picGzck", picGzck);
		returnmap.put("picLjck", picLjck);
		returnmap.put("picQlbj", picQlbj);
		returnmap.put("picSbgz", picSbgz);
		returnmap.put("picGzbj", picGzbj);
		bundle.put("pics", returnmap);
		return "firstpage";
	}
	
	/**
	 * 唯一初始化
	 * @param parameters
	 * @param bundle
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public String getHomepage(Parameters parameters, Bundle bundle) throws Exception {
		Map<String, Object> returnmap = new HashMap<String, Object>();
		String xjkssj_start = sdf_time.format(new Date())+" 00:00:00";
		String xjkssj_end = sdf_time.format(new Date())+" 23:59:59";
		parameters.set("xjkssj_start", sdf.parse(xjkssj_start));
		parameters.set("xjkssj_end",  sdf.parse(xjkssj_end));
		
		Calendar calendar = Calendar.getInstance(); 
        calendar.setTime(new Date()); 
        returnmap.put("sjto", calendar.getTime());
        calendar.add(Calendar.DAY_OF_MONTH, +1);
        returnmap.put("sjtm", calendar.getTime());

		returnmap.put("picDj", Sys.getResourceUrl("ts", "dj"));
		returnmap.put("picJj", Sys.getResourceUrl("ts", "jj"));
		returnmap.put("picLj", Sys.getResourceUrl("ts", "lj"));
		returnmap.put("picDj_bk", Sys.getResourceUrl("ts", "dj_bk"));
		returnmap.put("picJj_bk", Sys.getResourceUrl("ts", "jj_bk"));
		returnmap.put("picLj_bk", Sys.getResourceUrl("ts", "lj_bk"));
		
		String wxj = Sys.getResourceUrl("ts", "wxj");
		String dxj = Sys.getResourceUrl("ts", "dxj");
		String yxj = Sys.getResourceUrl("ts", "yxj");

		parameters.set("gkjIP", Sys.getRemoteIP());
		//加工单元信息
		Bundle sbxxbundle = Sys.callModuleService("em", "emservice_jgdyByGkjIP", parameters);
		if (null!=sbxxbundle) {
			List<Map<String, Object>> sbxx = (List<Map<String, Object>>) sbxxbundle.get("data");
			if (sbxx.size()>0) {
				parameters.set("jgdyid", sbxx.get(0).get("jgdyid"));
				
				Bundle djsmbundle = Sys.callModuleService("em", "emservice_query_djsm", parameters);
				if(null != djsmbundle)
				{
					String  sbmc = "";
					List<Map<String, Object>> djsmList = (List<Map<String, Object>>) djsmbundle.get("djsm");
					for (int i = 0; i < 36; i++) {
						returnmap.put("sbdw"+(i/12+1)+"T"+(i%12+1), 0);
					}
					for (int i = 0; i < djsmList.size(); i++) {
						if (null!=djsmList.get(i).get("dw")&&(!"".equals(djsmList.get(i).get("dw").toString()))) {
							if (!sbmc.equals(djsmList.get(i).get("sbmc").toString())) {
								sbmc = djsmList.get(i).get("sbmc").toString();
								returnmap.put("zsbmc"+(i/12+1), sbmc);
								returnmap.put("zsbid"+(i/12+1), djsmList.get(i).get("sbid"));
							}
							returnmap.put("sbdw"+(i/12+1)+djsmList.get(i).get("dw"), djsmList.get(i).get("dpjgsl"));
						}
					}
				}
				
				//工单信息
				Bundle gdbundle = Sys.callModuleService("pl", "plservice_gdxxnow", parameters);
				if(null != gdbundle)
				{
					List<Map<String, Object>> gdxx = (List<Map<String, Object>>) gdbundle.get("gdxx");
					if (gdxx.size()>0) {
						returnmap.put("s_gdid", gdxx.get(0).get("gdid"));
						returnmap.put("s_gxzid", gdxx.get(0).get("gxid"));
						returnmap.put("s_ljid", gdxx.get(0).get("ljid"));
						returnmap.put("s_jgdyid", gdxx.get(0).get("sbid"));
						returnmap.put("zlckh", gdxx.get(0).get("xh"));
						returnmap.put("zwcsl", gdxx.get(0).get("gdybgsl")+"/"+gdxx.get(0).get("jgsl"));
						parameters.set("val_lj", "('"+gdxx.get(0).get("ljid")+"')");
						//查询零件信息
						Bundle b_ljxx = Sys.callModuleService("pm", "pmservice_ljxx", parameters);
						List<Map<String, Object>> ljxx = (List<Map<String, Object>>) b_ljxx.get("ljxx");
						if (ljxx.size()>0) {
							gdxx.get(0).put("ljmc", ljxx.get(0).get("ljmc"));
							returnmap.put("zljmc", ljxx.get(0).get("ljmc"));
						}
						parameters.set("gxid", gdxx.get(0).get("gxid"));
						Bundle gxbundle = Sys.callModuleService("pm", "queryGxzxxByGxid", parameters);
						Map<String, Object> gx = (Map<String, Object>) gxbundle.get("gxxx");
						if (null != gx && gx.size() > 0) {
							returnmap.put("zgxzmc", gx.get("gxzmc"));
							parameters.set("gxids", gx.get("gxids").toString().replace("[", "(").replace("]", ")").replace("\"", "'"));
							Bundle gxtpbundle = Sys.callModuleService("pm", "pmservice_query_gxzxxFile", parameters);
							List<Map<String, Object>> gxtp = (List<Map<String, Object>>) gxtpbundle.get("gxtp");
							for (int i = 0; i < gxtp.size(); i++) {
								returnmap.put("gxtztpurl"+(i+1), gxtp.get(i).get("url"));
							}
						}
						
						
						Bundle scrwpcbundle = Sys.callModuleService("pro", "proService_pcxxbyid", parameters);
						List<Map<String, Object>> scrwpcList = (List<Map<String, Object>>) scrwpcbundle.get("pcxx");
						if (null != scrwpcList && scrwpcList.size() > 0) {
							returnmap.put("scrwid", scrwpcList.get(0).get("scrwid"));
						}
						
					}
					List<Map<String, Object>> hxtz = (List<Map<String, Object>>) gdbundle.get("hxtz");
					String val_lj = "";
					String val_gxz = "";
					for (int i = 0, len = hxtz.size(); i < len; i++) {
						if(i==0)
						{
							val_lj += "(";
							val_gxz += "(";
						}
						val_lj += "'"+hxtz.get(i).get("ljid")+"'";
						val_gxz += "'"+hxtz.get(i).get("gxzid")+"'";
						if(i < (len - 1)){
							val_lj += ",";
							val_gxz += ",";
						} else{
							val_lj += ")";
							val_gxz += ")";
						}
					}
//					parameters.set("val_gxz", val_gxz);
					if (!"".equals(val_lj)) {
						parameters.set("val_lj", val_lj);
						//查询零件信息
						Bundle b_ljxx = Sys.callModuleService("pm", "pmservice_ljxx", parameters);
						List<Map<String, Object>> ljxx = (List<Map<String, Object>>) b_ljxx.get("ljxx");
						for (int i = 0; i < hxtz.size(); i++) {
							for (int j = 0; j < ljxx.size(); j++) {
								if (hxtz.get(i).get("ljid").toString().equals(ljxx.get(j).get("ljid").toString())) {
									returnmap.put("hxtz"+(i+1), sdf_hour.format((java.sql.Timestamp)hxtz.get(i).get("hxsj"))+ "  零件名称：  "+ljxx.get(j).get("ljmc"));
									returnmap.put("hxtzgxz"+(i+1),hxtz.get(i).get("gxzid"));
									break;
								}
							}
						}
					}
				}
				
				//巡检
				Bundle xjbundle = Sys.callModuleService("pl", "plservice_xjxx", parameters);
				if(null != xjbundle)
				{
					List<Map<String, Object>> xjxxList = (List<Map<String, Object>>) xjbundle.get("xjxx");
					for (int i = 0; i < 9; i++) {
						if (i<xjxxList.size()) {
							if ("10".equals(xjxxList.get(i).get("zjzt"))) {
								returnmap.put("image_xj01"+(i+1), dxj);
							}else if ("20".equals(xjxxList.get(i).get("zjzt"))) {
								returnmap.put("image_xj01"+(i+1), yxj);
							}else if ("30".equals(xjxxList.get(i).get("zjzt"))) {
								returnmap.put("image_xj01"+(i+1), wxj);
							}
							if ("10".equals(xjxxList.get(i).get("xjzt"))) {
								returnmap.put("image_xj02"+(i+1), dxj);
							}else if ("20".equals(xjxxList.get(i).get("xjzt"))) {
								returnmap.put("image_xj02"+(i+1), yxj);
							}else if ("30".equals(xjxxList.get(i).get("xjzt"))) {
								returnmap.put("image_xj02"+(i+1), wxj);
							}
							returnmap.put("xjsj0"+(i+1), sdf_hour.format((java.sql.Timestamp)xjxxList.get(i).get("xjkssj")));
						}else{
							returnmap.put("image_xj01"+(i+1), yxj);
							returnmap.put("image_xj02"+(i+1), yxj);
							returnmap.put("xjsj0"+(i+1), "--:--");
						}
					}
				}
			}
		}
		
		bundle.put("pics", returnmap);
		return "homepage";
	}

	/**
	 * 获取报工
	 * @param parameters
	 * @param bundle
	 * @return
	 */
	public String getBg(Parameters parameters, Bundle bundle) {
		homePageActivity(bundle);
		return "bg";
	}

	/**
	 * 获取设备工装报警
	 * @param parameters
	 * @param bundle
	 * @return
	 */
	public String getSbgzbj(Parameters parameters, Bundle bundle) {
		homePageActivity(bundle);
		return "sbgzbj";
	}

	/**
	 * 获取物料送达
	 * @param parameters
	 * @param bundle
	 * @return
	 */
	public String getWlsd(Parameters parameters, Bundle bundle) {
		homePageActivity(bundle);
		return "wlsd";
	}

	/**
	 * 获取工装接收
	 * @param parameters
	 * @param bundle
	 * @return
	 */
	public String getGzjs(Parameters parameters, Bundle bundle) {
		homePageActivity(bundle);
		return "gzjs";
	}

	/**
	 * 获取工装送达
	 * @param parameters
	 * @param bundle
	 * @return
	 */
	public String getGzsd(Parameters parameters, Bundle bundle) {
		homePageActivity(bundle);
		return "gzsd";
	}

	/**
	 * 获取缺料报警
	 * @param parameters
	 * @param bundle
	 * @return
	 */
	public String getQlbj(Parameters parameters, Bundle bundle) {
		homePageActivity(bundle);
		return "qlbj";
	}

	/**
	 * 根据设备编号查询
	 * @param parameters
	 * @param bundle
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public String queryBySbbh(Parameters parameters, Bundle bundle) {
		String sbbh = parameters.getString("sbbh");
		parameters.set("sbid", sbbh);
		Bundle sbxxbundle = Sys.callModuleService("em", "emservice_sbxxFile", parameters);
		Map<String, Object> sbxx = (Map<String, Object>) sbxxbundle.get("sbxx");
		if (null != sbxx && sbxx.size() > 0) {
//			int code = Integer.parseInt(sbxx.get("sblxid").toString());
//			if (code == 10) {
//				sbxx.put("sblxmc", "i5");
//			} else if (code == 20) {
//				sbxx.put("sblxmc", "西门子");
//			} else {
//				sbxx.put("sblxmc", "funuc");
//			}
			bundle.put("data", sbxx);
		} else {
			bundle.put("data", null);
		}
		return "json:data";
	}
	public String djsmql(Parameters parameters, Bundle bundle) {
		Bundle djbundle = Sys.callModuleService("em", "emservice_sbdwql", parameters);
		
		return "json:data";
	}

	/**
	 * 查询工单编号
	 * @param parameters
	 * @param bundle
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public String queryByGdtm(Parameters parameters, Bundle bundle) {
		String gdtm = parameters.getString("gdtm");
		parameters.set("gdtm", gdtm);
		Bundle sbxxbundle = Sys.callModuleService("em", "emservice_sbxxInfo", parameters);

		List<Map<String, Object>> sbxxList = (List<Map<String, Object>>) sbxxbundle.get("sbxxList");

		if (null != sbxxList && sbxxList.size() == 1) {
			bundle.put("data", sbxxList.get(0));
		}
		return "json:data";
	}

	/**
	 * 根据工单和物料编号查询
	 * @param parameters
	 * @param bundle
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public String queryByGdhwltm(Parameters parameters, Bundle bundle) {
		String gdhwltm = parameters.getString("gdhwltm");
		parameters.set("gdbh", gdhwltm);
//		Bundle gdxxbundle = Sys.callModuleService("pl", "plservice_gdxxByGdbhIn_param", parameters);
//		List<Map<String, Object>> gdxxList = (List<Map<String, Object>>) gdxxbundle.get("gdxx");
		Map<String, Object> returnmap = new HashMap<String, Object>();
		Map<String, Object> returnstatus = new HashMap<String, Object>();
		
		String returnstatue = "该工单不存在，请核查";
		parameters.set("gkjIP", Sys.getRemoteIP());
		Bundle sbxxbundle = Sys.callModuleService("em", "emservice_jgdyByGkjIP", parameters);
		if (null==sbxxbundle) {
			return "json:";
		}
		List<Map<String, Object>> sbxx = (List<Map<String, Object>>) sbxxbundle.get("data");
		if (sbxx.size()<=0) {
			return "json:";
		}
		String val_sb = "(";
		for (int i = 0; i < sbxx.size(); i++) {
			if(i!=0)
			{
				val_sb = val_sb +",";
			}
			val_sb += "'" +sbxx.get(i).get("jgdyid")+"'";
		} 
		val_sb = val_sb +")";
		parameters.set("val_sb", val_sb);
		
		Bundle returnstatuebundle = Sys.callModuleService("pl", "plservice_gdxxByXh", parameters);
		List<Map<String, Object>> returnstatueList = (List<Map<String, Object>>) returnstatuebundle.get("gdxx");
		if (null != returnstatueList && returnstatueList.size() > 0) {
			if ("10".equals(returnstatueList.get(0).get("gdztdm").toString())
					|| "15".equals(returnstatueList.get(0).get("gdztdm").toString())) {
				returnstatus.put("returnstatue", "该工单未下发，请下发工单");
			} else if ("50".equals(returnstatueList.get(0).get("gdztdm").toString())) {
				returnstatus.put("returnstatue", "该工单已经完成，请核查");
			} else if ("60".equals(returnstatueList.get(0).get("gdztdm").toString())) {
				returnstatus.put("returnstatue", "该工单已经终止，请核查");
			} else {
				returnstatus.put("returnstatue", "");
			}
		} else {
			returnstatus.put("returnstatue", returnstatue);
		}
		
		
		Bundle gdxxInbundle = Sys.callModuleService("pl", "plservice_gdxxByXh", parameters);
		List<Map<String, Object>> gdxxInList = (List<Map<String, Object>>) gdxxInbundle.get("gdxx");
		
		if (null != gdxxInList && gdxxInList.size() > 0) {
		
			Bundle gdxxbundle = Sys.callModuleService("pl", "plservice_gdxxByXh", parameters);
			List<Map<String, Object>> gdxxList = (List<Map<String, Object>>) gdxxbundle.get("gdxx");
			if (null != gdxxList && gdxxList.size() > 0) {
				int gdid = (Integer) gdxxList.get(0).get("gdid");
				int pcid = (Integer) gdxxList.get(0).get("pcid");
				parameters.set("gdid", gdid);
				parameters.set("val_pc", "('" + pcid + "')");
				parameters.set("wllb", "('40','50')");
				parameters.set("ljid", gdxxList.get(0).get("ljid"));
				returnmap.put("ljid", gdxxList.get(0).get("ljid"));
				returnmap.put("jgsl", gdxxList.get(0).get("jgsl"));
				returnmap.put("ncbgsl", gdxxList.get(0).get("ncbgsl"));
				returnmap.put("jhkssj", ((java.sql.Timestamp)gdxxList.get(0).get("jhkssj")).getTime());
				returnmap.put("jhjssj", ((java.sql.Timestamp)gdxxList.get(0).get("jhjssj")).getTime());
				
				
				parameters.set("sbid", gdxxList.get(0).get("sbid"));
				Bundle sbbundle = Sys.callModuleService("em", "emservice_sbxxInfo", parameters);
				List<Map<String, Object>> sbList = (List<Map<String, Object>>) sbbundle.get("sbxxList");
				if (null != sbList && sbList.size() > 0) {
					returnmap.put("sbwz", sbList.get(0).get("sbwz"));
					returnmap.put("sbbh", sbList.get(0).get("sbbh"));
					returnmap.put("sbid", sbList.get(0).get("sbid"));
					parameters.set("sbbh", sbList.get(0).get("sbbh"));
				}
				
				Bundle ljbundle = Sys.callModuleService("pm", "pmservice_query_ljxxFile", parameters);
				Map<String, Object> ljmap = (Map<String, Object>) ljbundle.get("ljtpxx");
				if (null != ljmap && ljmap.size() > 0) {
					returnmap.put("ljurl", ljmap.get("url"));
					returnmap.put("ljbh", ljmap.get("ljbh"));
					returnmap.put("ljmc", ljmap.get("ljmc"));
				}
				
				Bundle sczbxxbundle = Sys.callModuleService("pl", "plservice_sczbxxb_param", parameters);
				List<Map<String, Object>> sczbxxList = (List<Map<String, Object>>) sczbxxbundle.get("sczbxx");
				if (null != sczbxxList && sczbxxList.size() > 0) {
					Integer wlid = (Integer) sczbxxList.get(0).get("wlid");
					parameters.set("val_wl", "(" + wlid + ")");
					Bundle wlxxbundle = Sys.callModuleService("mm", "mmservice_wlxx", parameters);
					List<Map<String, Object>> wlxxList = (List<Map<String, Object>>) wlxxbundle.get("wlxx");
					if (null != wlxxList && wlxxList.size() > 0) {
						returnmap.putAll(wlxxList.get(0));
						Bundle scrwpcbundle = Sys.callModuleService("pro", "proService_pcxxbyid", parameters);
						List<Map<String, Object>> scrwpcList = (List<Map<String, Object>>) scrwpcbundle.get("pcxx");
						if (null != scrwpcList && scrwpcList.size() > 0) {
							returnmap.put("pcbh", scrwpcList.get(0).get("pcbh")); 
							returnmap.put("pcmc", scrwpcList.get(0).get("pcmc"));
							returnmap.put("scrwid", scrwpcList.get(0).get("scrwid"));
							parameters.set("scrwid", scrwpcList.get(0).get("scrwid"));
							Bundle scrwbundle = Sys.callModuleService("pro", "proService_scrwByScrwid", parameters);
							Map<String, Object> scrw = (Map<String, Object>) scrwbundle.get("scrw");
							returnmap.put("scrwbh", scrw.get("scrwbh"));
							returnmap.put("scrwph", scrw.get("scph"));
						}
					} else {
						returnstatus.put("returnstatue", "该工单的物料信息不存在，请核查");
						returnmap = null;
					}
				} else {
					returnstatus.put("returnstatue", "该工单的生产任务准备清单不存在，请核查");
					returnmap = null;
				}
			} else {
				returnmap = null;
			}
		} else  {
			returnmap = null;
		}
		
		if(null == returnmap){
			bundle.put("data", returnstatus);
		} else {
			bundle.put("data", returnmap);
		}
		return "json:data";
	}

	/**
	 * 查询工装信息
	 * @param parameters
	 * @param bundle
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public String queryGzxx(Parameters parameters, Bundle bundle) {
		
		
		
		String gztm = parameters.getString("gztm");
		parameters.set("gzbh", gztm);
		Bundle gzxxbundle = Sys.callModuleService("wm", "wmService_queryGzxxwltm", parameters);
		
		List<Map<String, Object>> gzxxList = (List<Map<String, Object>>) gzxxbundle.get("gzxx");
		Map<String, Object> returnmap = new HashMap<String, Object>();
		if (null != gzxxList && gzxxList.size() > 0) {
			int wlid = Integer.parseInt(gzxxList.get(0).get("wlid").toString());
			parameters.set("wlid", wlid);
			Bundle wlxxbundle = Sys.callModuleService("mm", "mmservice_query_wlxxByWlid", parameters);
			List<Map<String, Object>> wlxxList = (List<Map<String, Object>>) wlxxbundle.get("wlxx");
			if (null != wlxxList && wlxxList.size() > 0) {
				returnmap.put("wlmc", wlxxList.get(0).get("wlmc"));
				returnmap.put("wlgg", wlxxList.get(0).get("wlgg"));
				returnmap.put("wlbh", wlxxList.get(0).get("wlbh"));
				returnmap.put("wllbdm", wlxxList.get(0).get("wllbdm"));
				returnmap.put("wltm", wlxxList.get(0).get("wltm"));
				int code = Integer.parseInt(wlxxList.get(0).get("wllbdm").toString());
				if (code == 10||code == 60) {
					returnmap.put("wllbmc", "刀具");
				} else if (code == 20) {
					returnmap.put("wllbmc", "夹具");
				} else {
					returnmap.put("wllbmc", "量具");
				}
				returnmap.put("wllxdm", wlxxList.get(0).get("wllxdm"));
			} else {
				returnmap = null;
			}
		} else {
			returnmap = null;
		}
		bundle.put("data", returnmap);
		
		parameters.set("gkjIP", Sys.getRemoteIP());
		Bundle sbbundle = Sys.callModuleService("em", "emservice_jgdyInfo", parameters);
		if (null==sbbundle) {
			return "json:data";
		}
		List<Map<String, Object>> sbxx = (List<Map<String, Object>>) sbbundle.get("sbxxList");
		if (sbxx.size()>0) {
			returnmap.put("gzsdwz", sbxx.get(0).get("sbwz"));
			returnmap.put("gzsdtm", sbxx.get(0).get("sbbh"));
			bundle.put("data", returnmap);
		}
		
		return "json:data";
	}

	/**
	 * 查询设备条码（设备编号）
	 * @param parameters
	 * @param bundle
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public String querySdtm(Parameters parameters, Bundle bundle) {
		Map<String, Object> returnmap = new HashMap<String, Object>();
		returnmap.put("sdtmflag", "0");
		String sdtm = parameters.getString("gzsdtm");
		parameters.set("sbbh", sdtm);
		Bundle sbbundle = Sys.callModuleService("em", "emservice_sbxxInfo", parameters);
		List<Map<String, Object>> sbList = (List<Map<String, Object>>) sbbundle.get("sbxxList");
		if (null != sbList && sbList.size() > 0) {
			returnmap.put("sdtmflag", "1");
			returnmap.put("sbmc", sbList.get(0).get("sbmc"));
		}
		bundle.put("data", returnmap);
		return "json:data";
	}

	/**
	 * 查询设备信息
	 * @param parameters
	 * @param bundle
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public String querySbxx(Parameters parameters, Bundle bundle) {
		String sbbh = parameters.getString("sbtm");
		parameters.set("sbbh", sbbh);
		Bundle sbbundle = Sys.callModuleService("em", "emservice_sbxxInfo", parameters);
		List<Map<String, Object>> sbList = (List<Map<String, Object>>) sbbundle.get("sbxxList");
		if (null != sbList && sbList.size() > 0) {
			bundle.put("data", sbList.get(0));
		} else {
			bundle.put("data", null);
		}
		return "json:data";
	}
	/**查询质检信息
	 * @param parameters
	 * @param bundle
	 * @return
	 */
	public String table_zjxx(Parameters parameters, Bundle bundle) {
		Bundle zjbundle = Sys.callModuleService("pm", "pmservice_table_zjxx", parameters);
		if (null!=zjbundle) {
			bundle.put("rows", zjbundle.get("zjxx"));
		}
		return "json:";
	}
	/**查询今天的工单信息
	 * @param parameters
	 * @param bundle
	 * @return
	 * @throws ParseException 
	 */
	@SuppressWarnings("unchecked")
	public String table_gdxxjt(Parameters parameters, Bundle bundle) throws ParseException {
		
		parameters.set("gkjIP", Sys.getRemoteIP());
		Bundle sbxxbundle = Sys.callModuleService("em", "emservice_jgdyByGkjIP", parameters);
		if (null!=sbxxbundle) {
			List<Map<String, Object>> sbxx = (List<Map<String, Object>>) sbxxbundle.get("data");
			if (sbxx.size()>0) {
				parameters.set("jgdyid", sbxx.get(0).get("jgdyid"));
				
				String jhkssj_start = sdf_time.format(new Date())+" 00:00:00";
				String jhkssj_end = sdf_time.format(new Date())+" 23:59:59";
				parameters.set("jhkssj_start", sdf.parse(jhkssj_start));
				parameters.set("jhkssj_end",  sdf.parse(jhkssj_end));
				Bundle zjbundle = Sys.callModuleService("pl", "plservice_gdxxmt", parameters);
				if (null!=zjbundle) {
					List<Map<String, Object>> gdxx = (List<Map<String, Object>>) zjbundle.get("gdxx");
					String val_lj = "";
					for (int i = 0, len = gdxx.size(); i < len; i++) {
						if(i==0)
						{
							val_lj += "(";
						}
						val_lj += "'"+gdxx.get(i).get("ljid")+"'";
						if(i < (len - 1)){
							val_lj += ",";
						} else{
							val_lj += ")";
						}
					}
					if (!"".equals(val_lj)) {
						parameters.set("val_lj", val_lj);
						//查询零件信息
						Bundle b_ljxx = Sys.callModuleService("pm", "pmservice_ljxx", parameters);
						List<Map<String, Object>> ljxx = (List<Map<String, Object>>) b_ljxx.get("ljxx");
						for (int i = 0; i < gdxx.size(); i++) {
							for (int j = 0; j < ljxx.size(); j++) {
								if (gdxx.get(i).get("ljid").toString().equals(ljxx.get(j).get("ljid").toString())) {
									gdxx.get(i).put("ljmc", ljxx.get(j).get("ljmc"));
									break;
								}
							}
						}
					}
					
					bundle.put("rows", gdxx);
				}
			}else{
				System.out.println("没找到此触摸屏IP对应的加工单元"+Sys.getRemoteIP());
			}
		}else{
			System.out.println("没找到此触摸屏IP对应的加工单元"+Sys.getRemoteIP());
		}
		return "json:";
	}
	@SuppressWarnings("unchecked")
	public String table_gdxxmt(Parameters parameters, Bundle bundle) throws ParseException {
		parameters.set("gkjIP", Sys.getRemoteIP());
		Bundle sbxxbundle = Sys.callModuleService("em", "emservice_jgdyByGkjIP", parameters);
		if (null!=sbxxbundle) {
			List<Map<String, Object>> sbxx = (List<Map<String, Object>>) sbxxbundle.get("data");
			if (sbxx.size()>0) {
				parameters.set("jgdyid", sbxx.get(0).get("jgdyid"));
				
				Calendar calendar = Calendar.getInstance(); 
		        calendar.setTime(new Date()); 
		        calendar.add(Calendar.DAY_OF_MONTH, +1);
				String jhkssj_start = sdf_time.format(calendar.getTime())+" 00:00:00";
				String jhkssj_end = sdf_time.format(calendar.getTime())+" 23:59:59";
				parameters.set("jhkssj_start", sdf.parse(jhkssj_start));
				parameters.set("jhkssj_end",  sdf.parse(jhkssj_end));
				Bundle zjbundle = Sys.callModuleService("pl", "plservice_gdxxmt", parameters);
				if (null!=zjbundle) {
					List<Map<String, Object>> gdxx = (List<Map<String, Object>>) zjbundle.get("gdxx");
					String val_lj = "";
					for (int i = 0, len = gdxx.size(); i < len; i++) {
						if(i==0)
						{
							val_lj += "(";
						}
						val_lj += "'"+gdxx.get(i).get("ljid")+"'";
						if(i < (len - 1)){
							val_lj += ",";
						} else{
							val_lj += ")";
						}
					}
					if (!"".equals(val_lj)) {
						parameters.set("val_lj", val_lj);
						//查询零件信息
						Bundle b_ljxx = Sys.callModuleService("pm", "pmservice_ljxx", parameters);
						List<Map<String, Object>> ljxx = (List<Map<String, Object>>) b_ljxx.get("ljxx");
						for (int i = 0; i < gdxx.size(); i++) {
							for (int j = 0; j < ljxx.size(); j++) {
								if (gdxx.get(i).get("ljid").toString().equals(ljxx.get(j).get("ljid").toString())) {
									gdxx.get(i).put("ljmc", ljxx.get(j).get("ljmc"));
									break;
								}
							}
						}
					}
				}
			}else{
				System.out.println("没找到此触摸屏IP对应的加工单元"+Sys.getRemoteIP());
			}
		}else{
			System.out.println("没找到此触摸屏IP对应的加工单元"+Sys.getRemoteIP());
		}
		return "json:";
	}
	public void save_zjjg(Parameters parameters, Bundle bundle) {
		Sys.callModuleService("pl", "plservice_save_zjjg", parameters);
	}

	/**
	 * 查询物料送达信息
	 * @param parameters
	 * @param bundle
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public String queryByWlsd(Parameters parameters, Bundle bundle) {
		Map<String, Object> returnmap = new HashMap<String, Object>();
		Map<String, Object> returnstatus = new HashMap<String, Object>();
		String gdtm = parameters.getString("gdtm");
		String flag = parameters.getString("flag");
		parameters.set("gdbh", gdtm);
		parameters.set("gkjIP", Sys.getRemoteIP());
		parameters.set("sbbh", "");
		parameters.set("wlbh", "");
		parameters.set("wllb", "");
		String returnstatue = "该流程卡号不存在，请核查";
		
		Bundle sbxxbundle = Sys.callModuleService("em", "emservice_jgdyByGkjIP", parameters);
		if (null==sbxxbundle) {
			System.out.println("没找到此触摸屏IP" + Sys.getRemoteIP() + "对应的加工单元");
			returnstatus.put("returnstatue","没找到此触摸屏IP" + Sys.getRemoteIP() + "对应的加工单元");
			bundle.put("json:data", returnstatus);
			return "json:";
		}
		List<Map<String, Object>> sbxx = (List<Map<String, Object>>) sbxxbundle.get("data");
		if (sbxx.size()<=0) {
			System.out.println("没找到此触摸屏IP" + Sys.getRemoteIP() + "对应的加工单元");
			returnstatus.put("returnstatue", "没找到此触摸屏IP" + Sys.getRemoteIP() + "对应的加工单元");
			bundle.put("data", returnstatus);
			return "json:data";
		}
		String val_sb = "(";
		for (int i = 0; i < sbxx.size(); i++) {
			if(i!=0)
			{
				val_sb = val_sb +",";
			}
			val_sb += "'" +sbxx.get(i).get("jgdyid")+"'";
		} 
		val_sb = val_sb +")";
		parameters.set("val_sb", val_sb);
		
		Bundle returnstatuebundle = Sys.callModuleService("pl", "plservice_gdxxByXh", parameters);
		List<Map<String, Object>> returnstatueList = (List<Map<String, Object>>) returnstatuebundle.get("gdxx");
		if (null != returnstatueList && returnstatueList.size() > 0) {
			if("10".equals(returnstatueList.get(0).get("gdztdm").toString()) || "15".equals(returnstatueList.get(0).get("gdztdm").toString())){
				returnstatus.put("returnstatue", "该流程卡未下发，请下发流程卡");
			}else if("50".equals(returnstatueList.get(0).get("gdztdm").toString()) ){
				returnstatus.put("returnstatue", "该流程卡已经完成，请核查");
			}else if("60".equals(returnstatueList.get(0).get("gdztdm").toString()) ){
				returnstatus.put("returnstatue", "该流程卡已经终止，请核查");
			}else {
				returnstatus.put("returnstatue", "");
			}
		} else {
			returnstatus.put("returnstatue", returnstatue);
		}
		
		Bundle gdxxbundle = Sys.callModuleService("pl", "plservice_gdxxByXh", parameters);
		List<Map<String, Object>> gdxxList = (List<Map<String, Object>>) gdxxbundle.get("gdxx");
		
		if (null != gdxxList && gdxxList.size() > 0) {
			int gdid = (Integer) gdxxList.get(0).get("gdid");
			parameters.set("gdid", gdid);
			parameters.set("gxid", gdxxList.get(0).get("gxid"));
			if ("3".equals(flag)) {
				parameters.set("wllb", "('10','20','30')");
			} else {
				parameters.set("wllb", "('40','50','70')");
			}
			parameters.set("gdid", gdxxList.get(0).get("gdid"));
			parameters.set("sbid", gdxxList.get(0).get("sbid"));
			returnmap.put("gdid", gdid);
			returnmap.put("jgsl", gdxxList.get(0).get("jgsl"));
			returnmap.put("ysdsl", gdxxList.get(0).get("ysdsl"));
			returnmap.put("ncbgsl", gdxxList.get(0).get("ncbgsl"));
			returnmap.put("gdybgsl", gdxxList.get(0).get("gdybgsl"));
			returnmap.put("jhkssj", ((java.sql.Timestamp)gdxxList.get(0).get("jhkssj")).getTime());
			returnmap.put("jhjssj", ((java.sql.Timestamp)gdxxList.get(0).get("jhjssj")).getTime());

			try {
				if (null != gdxxList.get(0).get("jgkssj")) {
					returnmap.put("jgkssj", sdf.format(sdf.parse(gdxxList.get(0).get("jgkssj").toString())));
				}
			} catch (ParseException e) {
				e.printStackTrace();
			}
			Bundle sczbxxbundle = Sys.callModuleService("pl", "plservice_sczbxxb_param", parameters);
			List<Map<String, Object>> sczbxxList = (List<Map<String, Object>>) sczbxxbundle.get("sczbxx");
			if (null != sczbxxList && sczbxxList.size() > 0) {
				Integer wlid = (Integer) sczbxxList.get(0).get("wlid");
				parameters.set("val_wl", "(" + wlid + ")");
				Bundle wlxxbundle = Sys.callModuleService("mm", "mmservice_wlxx", parameters);
				List<Map<String, Object>> wlxxList = (List<Map<String, Object>>) wlxxbundle.get("wlxx");
				if (null != wlxxList && wlxxList.size() > 0) {
					returnmap.put("wlbh", wlxxList.get(0).get("wlbh"));
					returnmap.put("wlmc", wlxxList.get(0).get("wlmc"));
					returnmap.put("wllbdm", wlxxList.get(0).get("wllbdm"));
					parameters.set("wlbh", wlxxList.get(0).get("wlbh"));
					parameters.set("wllb", wlxxList.get(0).get("wllbdm"));
				}
			}
			parameters.set("pcid", gdxxList.get(0).get("pcid"));
			Bundle pcbundle = Sys.callModuleService("pro", "proserver_scrwpcListByPcidService", parameters);
			List<Map<String, Object>> pcList = (List<Map<String, Object>>) pcbundle.get("scrwpcList");
			if (null != pcList && pcList.size() > 0) {
				returnmap.put("pcbh", pcList.get(0).get("pcbh"));
				returnmap.put("pcmc", pcList.get(0).get("pcmc"));
				returnmap.put("pcid", gdxxList.get(0).get("pcid"));
				returnmap.put("scrwid", pcList.get(0).get("scrwid"));

				parameters.set("scrwid", pcList.get(0).get("scrwid"));
				Bundle scrwbundle = Sys.callModuleService("pro", "proService_scrwByScrwid", parameters);
				Map<String, Object> scrw = (Map<String, Object>) scrwbundle.get("scrw");
				if(null != scrw && scrw.size() > 0 ){
					returnmap.put("scrwbh", scrw.get("scrwbh"));
				} 
			}
			parameters.set("sbid", gdxxList.get(0).get("sbid"));
			Bundle sbbundle = Sys.callModuleService("em", "emservice_jgdyInfo", parameters);
			List<Map<String, Object>> sbList = (List<Map<String, Object>>) sbbundle.get("sbxxList");
			if (null != sbList && sbList.size() > 0) {
				returnmap.put("sbwz", sbList.get(0).get("sbwz"));
				returnmap.put("sbbh", sbList.get(0).get("sbbh"));
				returnmap.put("sbid", sbList.get(0).get("jgdyid"));
				parameters.set("sbbh", sbList.get(0).get("sbbh"));
			}

			Bundle gxbundle = Sys.callModuleService("pm", "queryGxzxxByGxid", parameters);
			Map<String, Object> gx = (Map<String, Object>) gxbundle.get("gxxx");
			if (null != gx && gx.size() > 0) {
				returnmap.put("gxid", gx.get("gxzid"));
				returnmap.put("gxbh", gx.get("gxzbh"));
				returnmap.put("gxzmc", gx.get("gxzmc"));
				parameters.set("gxids", gx.get("gxids").toString().replace("[", "(").replace("]", ")").replace("\"", "'"));
			}
			

			parameters.set("zxbz", "1");
//			Bundle cxbundle = Sys.callModuleService("pm", "pmservice_cxxxbysbgx", parameters);
//			List<Map<String, Object>> cxList = (List<Map<String, Object>>) cxbundle.get("cxxx");
//			if (null != cxList && cxList.size() > 0) {
//				returnmap.put("cxmc", cxList.get(0).get("cxmc"));
//			}

			parameters.set("ljid", gdxxList.get(0).get("ljid"));
			Bundle ljbundle = Sys.callModuleService("pm", "pmservice_query_ljxxFile", parameters);
			Map<String, Object> ljmap = (Map<String, Object>) ljbundle.get("ljtpxx");
			if (null != ljmap && ljmap.size() > 0) {
				returnmap.put("ljurl", ljmap.get("url"));
				returnmap.put("ljbh", ljmap.get("ljbh"));
				returnmap.put("ljmc", ljmap.get("ljmc"));
			}

			Bundle gxtpbundle = Sys.callModuleService("pm", "pmservice_query_gxzxxFile", parameters);
			List<Map<String, Object>> gxtp = (List<Map<String, Object>>) gxtpbundle.get("gxtp");
			for (int i = 0; i < gxtp.size(); i++) {
				returnmap.put("gxtztpurl"+(i+1), gxtp.get(i).get("url"));
			}
			
			
//			Bundle ybgslbundle = Sys.callModuleService("pc", "pcservice_queryYbgsl", parameters);
//			int ybgsl = (Integer) ybgslbundle.get("ybgsl");
//			returnmap.put("ybgsl", ybgsl);
			

			if ("1".equals(flag)) {
				Bundle lsbundle = Sys.callModuleService("mf", "mfservice_querySl", parameters);
				int count = (Integer) lsbundle.get("count");
				if (count > 0) {
					returnmap.put("sl", count);
				} else {
					returnmap.put("sl", 0);
				}
				
				
				Bundle zhsdsjbundle = Sys.callModuleService("mf", "mfservice_queryMaxZhsdsj", parameters);
				if("".equals(zhsdsjbundle.get("zhsdsj"))){
					returnmap.put("zhsdsj", "");
				} else {
					long zhsdsj = ((Date)zhsdsjbundle.get("zhsdsj")).getTime();
					returnmap.put("zhsdsj", zhsdsj);
				}
			}
		} else {
			returnmap = null;
		}
		
		if(returnmap == null){
			returnmap = new HashMap<String, Object>();
		}
		returnmap.put("returnstatus", returnstatus);
		bundle.put("data", returnmap);
		
		return "json:data";
	}

	/**
	 * 保存设备告警
	 * @param parameters
	 * @param bundle
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public String saveSbgj(Parameters parameters, Bundle bundle) {
		String sbbh = parameters.getString("sbbh");
		String sbmc = parameters.getString("sbmc");
		String sblxid = parameters.getString("sblxid");
		
		parameters.set("zybh", sbbh);
		parameters.set("sbmc", sbmc);
		parameters.set("sblxid", sblxid);
		Bundle gjbundle = Sys.callModuleService("war", "sbgj_service", parameters);
		int count = (Integer) gjbundle.get("count");
		Map<String, Object> returnmap = new HashMap<String, Object>();
		if (count > 0) {
			
			//sendActivity
			String activityType = "1"; // 动态任务
			String templateId = "sbgz_tp";
			String[] roles = new String[] { "MANUFACTURING_MANAGEMENT_ROLE"};// 关注该动态的角色
			Map<String, Object> data = new HashMap<String, Object>();
			Date now = new Date();
			data.put("sbbh", parameters.get("zybh"));// 设备编号
			data.put("pcbh", parameters.get("sbmc"));// 设备名称
			data.put("sblxid", parameters.get("sblxid"));// 设备类型
			data.put("sbmc", sbmc);
//			data.put("gzyy", "");// 故障原因
//			data.put("gzdm", "");//故障代码
//			data.put("gzwz", "");//故障位置
			data.put("fssj", now.getTime());//发生时间
			Bundle b_sbxx = Sys.callModuleService("em", "emservice_sbxxFile", parameters);
			Map<String, Object> map_sb = (Map<String, Object>) b_sbxx.get("sbxx");
			data.put("sbtp", map_sb.get("url"));
			data.put("userid", Sys.getUserIdentifier());// 操作人
			data.put("username", Sys.getUserName());// 操作人
			sendActivity(activityType, templateId, true, roles, null, null, data);
			
			//sendMessage
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日  HH时mm分");
			String message_type = "0";// 待办事项
			String url = "/war/ycgj/query_ycgj?_m=warmanagement";
			Map<String, Object> message_data = new HashMap<String, Object>();
			
			String bizType = "scrwpcxf";// 设备故障报警
			String bizId = parameters.get("zybh").toString();
			StringBuffer content = new StringBuffer();
			StringBuffer title = new StringBuffer();
			//设备名称（编号为***）故障告警
			title.append(sbmc).append("（设备编号:").append(parameters.get("zybh")).append("）故障告警");
			//****年**月**日**时**分，设备名称（编号为***）发生故障，请予以修理。
			content.append(sdf.format(now)).append(",").append(sbmc).append("（设备编号:").append(parameters.get("zybh")).append("）发生故障,请予以修理。");
			
			String[] message_roles = new String[] { "MANUFACTURING_MANAGEMENT_ROLE"};
			
			sendMessage(message_type, title.toString(), null, content.toString(), "系统", bizType, bizId,
					"0"/* 信息优先级：0:一般，1：紧急 ， 2：非常紧急 */, url, message_roles, null, null,
					"system"/* manual:人工发送，system：系统发送，interface：外部接口 */, "ts"/* 消息来源ID */, message_data, now, null,
					null, null);
			
			returnmap.put("msg", "设备故障报警成功");
		} else {
			returnmap.put("msg", "设备故障报警失败");
		}
		bundle.put("data", returnmap);
		return "json:data";
	}

	/**
	 * 
	 * @param parameters
	 * @param bundle
	 * @return
	 * @throws ParseException 
	 */
	public String saveWlsd(Parameters parameters, Bundle bundle) throws ParseException {
		String wlbh = parameters.getString("wlbh");
		int sl = Integer.parseInt(parameters.getString("sl"));
		String sbbh = parameters.getString("sbbh");
		String wllb = parameters.getString("wllbdm");
		String gdbh = parameters.getString("gdtm");
		String flag = parameters.getString("sdorjs");
		String ljmc = parameters.getString("ljmc");
		String ljbh = parameters.getString("ljbh");
		String pcmc = parameters.getString("pcmc");
		String pcbh = parameters.getString("pcbh");
//		String wlmc = parameters.getString("wlmc");
		String scrwbh = parameters.getString("scrwbh");
		
		String gxmc = parameters.getString("gxmc");
		String jgsl = parameters.getString("jgsl");
		String jhkssj = parameters.getString("jhkssj");
		String jhjssj = parameters.getString("jhjssj");
		String wlsdsl = parameters.getString("wlsdsl");
		String zhsdsj = parameters.getString("zhsdsj");
		
		parameters.set("gdbh", gdbh);
		parameters.set("wlbh", wlbh);
		parameters.set("sl", sl);
		parameters.set("sbbh", sbbh);
		parameters.set("wllb", wllb);
		parameters.set("flag", flag);
		String tips;
		String templateId = "";
		Map<String, Object> data = new HashMap<String, Object>();
		Date date = new Date();
		
		if ("sd".equals(flag)) {
			tips = "物料送达";
			templateId = "wlsd_tp";
			data.put("sdsj", date.getTime());// 送达时间
			data.put("sdsl", sl);// 送达数量
		} else {
			tips = "物料接收";
			templateId = "wljs_tp";
			data.put("jssj", date.getTime());// 接收时间
			data.put("jssl", sl);// 接收数量
			data.put("sdsl", wlsdsl);// 送达数量
			data.put("zhsdsj", zhsdsj);// XX送达时间
		}
		Bundle wlsdlsbundle = Sys.callModuleService("mf", "mfservice_wlsdls", parameters);
		int wlsdlscount = (Integer) wlsdlsbundle.get("count");

		Bundle wlsdbundle = Sys.callModuleService("mf", "mfservice_wlsd", parameters);
		int count = (Integer) wlsdbundle.get("count");
		Map<String, Object> returnmap = new HashMap<String, Object>();
		if (count == 1 && wlsdlscount == 1) {

			String activityType = "2"; // 动态任务
			String[] roles = new String[] { "MANUFACTURING_MANAGEMENT_ROLE", "MATERIAL_DELIVERY_ROLE" };// 关注该动态的角色
			//查询任务完成进度
			Parameters progressCondition = new Parameters();
			progressCondition.set("scrwbh", scrwbh);
			Bundle resultProgress = Sys.callModuleService("pc", "pcservice_caculateProgress", progressCondition);
			Object scrwjd = resultProgress.get("scrwjd");
			data.put("scrwjd", scrwjd);//生产任务进度
			data.put("scrwbh", scrwbh);// 生产任务编号
			data.put("pcmc", pcmc);// 批次名称
			data.put("pcbh", pcbh);// 批次编号
			data.put("ljmc", ljmc);// 零件名称

			data.put("ljbh", ljbh);// 零件编号
			data.put("gdbh", gdbh);// 工单编号
			data.put("wlbh", wlbh);// 物料编号
			
			data.put("gxmc", gxmc);// 工序名称
			data.put("jgsl", jgsl);// 计划加工数量
			data.put("jhkssj", jhkssj);// 计划开始时间
			data.put("jhjssj", jhjssj);// 计划结束时间

			data.put("sbbh", sbbh);// 设备编号
			data.put("userid", Sys.getUserIdentifier());// 操作人
			data.put("username", Sys.getUserName());// 操作人
			sendActivity(activityType, templateId, true, roles, null, null, data);

			returnmap.put("msg", tips + "成功");
		} else {
			returnmap.put("msg", tips + "失败");
		}
		bundle.put("data", returnmap);
		return "json:data";
	}

	/**
	 * 
	 * @param parameters
	 * @param bundle
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public String saveGzsd(Parameters parameters, Bundle bundle) {
		String sdtm = parameters.getString("gzsdtm");
		String wllb = parameters.getString("wllbdm");
		String gztm = parameters.getString("gztm");
		String sbmc = parameters.getString("sbmc");
		String gzmc = parameters.getString("gzmc");
		String gzgg = parameters.getString("gzgg");
		Date date = new Date();
		parameters.set("sdtm", sdtm);
		parameters.set("wllb", wllb);
		parameters.set("gztm", gztm);
		Map<String, Object> data = new HashMap<String, Object>();
		
		Bundle sbxxbbundle = Sys.callModuleService("em", "emservice_sbxxInfo", parameters);
		Map<String, Object> sbxx = (Map<String, Object>) sbxxbbundle.get("sbxx");
		if (null != sbxx && sbxx.size() > 0) {
			data.put("sdwz", sbxx.get("sbwz"));// 送达位置
		}
		

		Bundle gzsdbundle = Sys.callModuleService("mf", "mfservice_gzsd", parameters);
		int count = (Integer) gzsdbundle.get("count");

		Map<String, Object> returnmap = new HashMap<String, Object>();

		if (count == 1) {

			String activityType = "2"; // 动态任务
			String templateId = "gzsd_tp";
			String[] roles = new String[] { "MANUFACTURING_MANAGEMENT_ROLE", "MATERIAL_DELIVERY_ROLE" };// 关注该动态的角色
			

			data.put("sdtm", sdtm);// 设备条码
			data.put("sbmc", sbmc);// 设备名称
			data.put("wllb", Sys.getDictFieldNames("gzlx", wllb)[0]);// 工装类别
			data.put("gztm", gztm);// 工装条码
			data.put("gzmc", gzmc);// 工装名称
			data.put("gzgg", gzgg);// 工装规格
			data.put("sdsj", date.getTime());// 送达时间
			data.put("userid", Sys.getUserIdentifier());// 操作人
			data.put("username", Sys.getUserName());// 操作人
			sendActivity(activityType, templateId, true, roles, null, null, data);

			returnmap.put("msg", "工装送达成功");
		} else {
			returnmap.put("msg", "工装送达失败");
		}
		bundle.put("data", returnmap);
		return "json:data";
	}

	/**
	 * 
	 * @param parameters
	 * @param bundle
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public String saveGzjs(Parameters parameters, Bundle bundle) {
		Map<String, Object> data = new HashMap<String, Object>();
		String sdtm = parameters.getString("sdtm");
		String wllb = parameters.getString("wllbdm");
		String gztm = parameters.getString("gztm");
		parameters.set("sdtm", sdtm);
		parameters.set("wllb", wllb);
		parameters.set("gztm", gztm);
		Date date = new Date();

		String sbmc = parameters.getString("sbmc");
		String gzmc = parameters.getString("gzmc");
		String gzgg = parameters.getString("gzgg");

		Bundle gzjsbundle = Sys.callModuleService("mf", "mfservice_gzjs", parameters);
		int count = (Integer) gzjsbundle.get("count");
		
		Bundle sbxxbbundle = Sys.callModuleService("em", "emservice_sbxxInfo", parameters);
		Map<String, Object> sbxx = (Map<String, Object>) sbxxbbundle.get("sbxx");
		if (null != sbxx && sbxx.size() > 0) {
			data.put("sdwz", sbxx.get("sbwz"));// 设备位置
		}
		
		
		Bundle gzzhsjbundle = Sys.callModuleService("mf", "mfservice_queryMaxGzzhxx", parameters);
		Object zhsj = gzzhsjbundle.get("zhsdsj");

		Map<String, Object> returnmap = new HashMap<String, Object>();

		if (count == 1) {
			String activityType = "2"; // 动态任务
			String templateId = "gzjs_tp";
			String[] roles = new String[] { "MANUFACTURING_MANAGEMENT_ROLE", "MATERIAL_DELIVERY_ROLE" };// 关注该动态的角色
			
			data.put("zhsj", zhsj);// 送达时间
			data.put("jssj", date.getTime());// 接收时间
			data.put("sdtm", sdtm);// 设备条码
			data.put("sbmc", sbmc);// 设备名称
			data.put("wllb", Sys.getDictFieldNames("gzlx", wllb)[0]);// 工装类别
//			data.put("wllb", wllb);// 工装类别
			data.put("gztm", gztm);// 工装条码
			data.put("gzmc", gzmc);// 工装名称
			data.put("gzgg", gzgg);// 工装规格
			data.put("userid", Sys.getUserIdentifier());// 操作人
			data.put("username", Sys.getUserName());// 操作人
			sendActivity(activityType, templateId, true, roles, null, null, data);
			returnmap.put("msg", "工装接收成功");
		} else {
			returnmap.put("msg", "工装接收失败");
		}
		bundle.put("data", returnmap);
		return "json:data";
	}

	/**
	 * 
	 * @param parameters
	 * @param bundle
	 * @return
	 */
	@SuppressWarnings({  "rawtypes" })
	public String saveQlgj(Parameters parameters, Bundle bundle) {
		String gdhwltm = parameters.getString("gdhwltm");
		String pcbh = parameters.getString("pcbh");
		String wlbh = parameters.getString("wlbh");
		String wlmc = parameters.getString("wlmc");
		String pcmc = parameters.getString("pcmc");
		String ljbh = parameters.getString("ljbh");
		String ljmc = parameters.getString("ljmc");
		String ljid = parameters.getString("ljid");
//		String gxmc = parameters.getString("gxmc");
		String sbbh = parameters.getString("sbbh");
		String jgsl = parameters.getString("jgsl");
		String jhkssj = parameters.getString("jhkssj");
		String jhjssj = parameters.getString("jhjssj");
		String scrwbh = parameters.getString("scrwbh");
		String sbwz = parameters.getString("sbwz");
		String ncbgsl = parameters.getString("ncbgsl");
		
		parameters.set("zybh", gdhwltm);
		parameters.set("pcbh", pcbh);
		parameters.set("wlbh", wlbh);
		parameters.set("wlmc", wlmc);
		Bundle gjbundle = Sys.callModuleService("war", "qlgj_service", parameters);
		

		
		int count = (Integer) gjbundle.get("count");
		Map<String, Object> returnmap = new HashMap<String, Object>();
		if (count > 0) {
			
			//sendActivity
			String activityType = "2"; // 动态任务
			String templateId = "qlbj_tp";
			String[] roles = new String[] { "MANUFACTURING_MANAGEMENT_ROLE", "MATERIAL_DELIVERY_ROLE" };// 关注该动态的角色
			
//			//根据工单ID查询工单信息
//			parameters.set("gdid", gdhwltm);
//			Bundle b_gdxx = Sys.callModuleService("pl", "plservice_gdxxByGdID", parameters);
//			List<Map<String, Object>> gdxx = (List<Map<String, Object>>) b_gdxx.get("gdxx");
			
			//根据设备ID查询设备信息
//			String sbid = (String)gdxx.get(0).get("sbid");
//			parameters.set("sbid", sbid);
//			Bundle b_em = Sys.callModuleService("em", "emservice_sbxxInfo", parameters);
//			List<Map<String, Object>> sbxx = (List<Map<String, Object>>) b_em.get("sbxx");
			
			//查询零件图片
			parameters.set("ljid", ljid);
			Bundle resultLjUrl = Sys.callModuleService("pm", "partsInfoService", parameters);
			Object ljtp = ((Map)resultLjUrl.get("partsInfo")).get("url");
			//查询任务完成进度
			Parameters progressCondition = new Parameters();
			progressCondition.set("scrwbh", scrwbh);
			Bundle resultProgress = Sys.callModuleService("pc", "pcservice_caculateProgress", progressCondition);
			Object scrwjd = resultProgress.get("scrwjd");
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("ljtp", ljtp);//零件图片
			data.put("scrwbh", scrwbh);// 生产任务编号
			data.put("pcmc", pcmc);// 批次名称
			data.put("pcbh", pcbh);// 批次编号
			data.put("ljmc", ljmc);// 零件名称
			data.put("scrwjd", scrwjd);// 生产任务进度
			data.put("ljbh", ljbh);// 零件编号
			data.put("gdbh", gdhwltm);//工单编号
			data.put("wlbh", wlbh);// 物料编号
			data.put("wlmc", wlmc);// 物料名称
			
			data.put("sbbh", sbbh);// 设备编号
			
			data.put("jgsl", jgsl);//工单计划加工数量
			data.put("ncbgsl", ncbgsl);//NC自动报工数量
			data.put("jhkssj", jhkssj);//计划开始时间
			data.put("jhjssj", jhjssj);//计划结束时间
			
			
//			data.put("jgsl", gdxx.get(0).get("jgsl"));//工单计划加工数量
//			data.put("ncbgsl", gdxx.get(0).get("ncbgsl"));//NC自动报工数量
//			data.put("jhkssj", ((java.sql.Timestamp)gdxx.get(0).get("jhkssj")).getTime());//计划开始时间
//			data.put("jhjssj", ((java.sql.Timestamp)gdxx.get(0).get("jhjssj")).getTime());//计划结束时间
			
			data.put("userid", Sys.getUserIdentifier());// 操作人
			data.put("username", Sys.getUserName());// 操作人
			sendActivity(activityType, templateId, true, roles, null, null, data);
			
			//sendMessage
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日  HH时mm分");
			String message_type = "0";// 待办事项
			String url = "/war/ycgj/query_ycgj?_m=warmanagement";
			Map<String, Object> message_data = new HashMap<String, Object>();
			Date now = new Date();
			String bizType = "scrwpcxf";// 缺料报警
			String bizId = parameters.get("zybh").toString();
			StringBuffer content = new StringBuffer();
			StringBuffer title = new StringBuffer();
			//物料名称（编号为***）缺料告警
			title.append(wlmc).append("（编号为").append(parameters.get("zybh")).append("）缺料告警");
			//****年**月**日**时**分，产品名称（编号为***）的生产工单（工单编号为***），机台位置发生缺料告警，物料名称（编号为***），请安排送料。
			content.append(sdf.format(now)).append(",").append(ljmc).append("（编号为")
				   .append(ljbh).append("）的生产工单（工单编号为").append(gdhwltm).append("）,机台位置（")
				   .append(sbwz).append("）发生缺料告警(物料名称:").append(wlmc)
				   .append( "物料编号:").append(wlbh).append("),请安排送料");
			
			String[] message_roles = new String[] { "MANUFACTURING_MANAGEMENT_ROLE", "MATERIAL_DELIVERY_ROLE" };
			
			sendMessage(message_type, title.toString(), null, content.toString(), "系统", bizType, bizId,
					"0"/* 信息优先级：0:一般，1：紧急 ， 2：非常紧急 */, url, message_roles, null, null,
					"system"/* manual:人工发送，system：系统发送，interface：外部接口 */, "ts"/* 消息来源ID */, message_data, now, null,
					null, null);
			
			returnmap.put("msg", "缺料报警成功");
		} else {
			returnmap.put("msg", "缺料报警失败");
		}
		bundle.put("data", returnmap);
		return "json:data";
	}
	
	@SuppressWarnings("unchecked")
	public String saveHxsq(Parameters parameters, Bundle bundle) {
		parameters.set("gkjIP", Sys.getRemoteIP());
		Bundle sbxxbundle = Sys.callModuleService("em", "emservice_jgdyByGkjIP", parameters);
		if (null!=sbxxbundle) {
			List<Map<String, Object>> sbxx = (List<Map<String, Object>>) sbxxbundle.get("data");
			if (sbxx.size()>0) {
				parameters.set("jgdyid", sbxx.get(0).get("jgdyid"));
				parameters.set("jgdymc", sbxx.get(0).get("jgdymc"));
			}
			Bundle gjbundle = Sys.callModuleService("war", "hxsq_service", parameters);
			int count = (Integer) gjbundle.get("count");
			Map<String, Object> returnmap = new HashMap<String, Object>();
			if (count > 0) {
				returnmap.put("msg", "换线申请成功");
			} else {
				returnmap.put("msg", "换线申请失败");
			}
			bundle.put("data", returnmap);
		}
		
		
		return "json:data";
	}

	// public String pic_display(Parameters parameters, Bundle bundle) {
	//
	// Bundle filebundle = Sys.callModuleService("em", "pic_display_server",
	// parameters);
	// File file_display = (File) filebundle.get("file_display");
	// bundle.put("file_display", file_display);
	// return "file:file_display";
	// }

	/**
	 * 
	 * @param parameters
	 * @param bundle
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String saveBg(Parameters parameters, Bundle bundle) {
		String gdid = parameters.getString("gdid");
		String bgsl = parameters.getString("bgsl");
		String bfgf = parameters.getString("bfgf");
		String bflf = parameters.getString("bflf");
		String bfsl = parameters.getString("bfsl");
		String sbid = parameters.getString("sbid");
		String sbbh = parameters.getString("sbbh");
		String gxbh = parameters.getString("gxbh");
		String pcbh = parameters.getString("pcbh");
		String gdbh = parameters.getString("gdtm");
		String ljbh = parameters.getString("ljbh");
		String ljmc = parameters.getString("ljmc");
		String scrwbh = parameters.getString("scrwbh");
		String gdybgsl = parameters.getString("gdybgsl");
		String pcmc = parameters.getString("pcmc");
		String gxmc = parameters.getString("gxmc");
		String jhkssj = parameters.getString("jhkssj");
		String jhjssj = parameters.getString("jhjssj");
		String jgsl = parameters.getString("jgsl");
		parameters.set("gdid", gdid);
		parameters.set("bgsl", bgsl);
		parameters.set("bfsl", bfsl);
		parameters.set("bfgf", bfgf);
		parameters.set("bflf", bflf);
		parameters.set("sbid", sbid);
		parameters.set("jgdyid", sbid);
		parameters.set("zybh", gdbh);
		parameters.set("pcbh", pcbh);

		Bundle gdbbundle = Sys.callModuleService("pl", "plservice_saveAupdateGdb", parameters);
		int gdbcount = (Integer) gdbbundle.get("count");
		int bglscount = 0;
		String templateId = "";
		String[] roles = null;
		String activityType = "0"; // 动态任务
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("gdbh", gdbh);// 工单编号
		data.put("sbbh", sbbh);// 设备编号
		data.put("gxbh", gxbh);// 工序编号
		data.put("pcbh", pcbh);// 批次编号
		data.put("pcmc", pcmc);// 批次名称
		data.put("gxmc", gxmc);// 工序名称
		data.put("jgsl", jgsl);//工单加工数量
		data.put("scrwbh", scrwbh);// 生产编号
		data.put("ljbh", ljbh);// 零件编号
		data.put("ljmc", ljmc);// 零件名称
		data.put("gdybgsl", gdybgsl);// 加工数量
		data.put("jhkssj", jhkssj);// 计划加工开始时间
		data.put("jhjssj", jhjssj);// 计划加工结束时间
		data.put("userid", Sys.getUserIdentifier());// 操作人
		data.put("username", Sys.getUserName());// 操作人
		data.put("bfgf", bfgf);// 工废数量
		data.put("bflf", bflf);// 料废数量
		//查询零件图片、
		Parameters ljCond = new Parameters();
		ljCond.set("query", ljbh);
		Bundle resultLjxx = Sys.callModuleService("pm", "queryLjxxByLjbh", ljCond);
		if(resultLjxx!=null && resultLjxx.get("ljxx")!=null){
			List<Map<String,Object>> ljxx = (List<Map<String,Object>>)resultLjxx.get("ljxx");
			Object ljid = ljxx.get(0).get("ljid");
			parameters.set("ljid", ljid);
			Bundle resultLjUrl = Sys.callModuleService("pm", "partsInfoService", parameters);
			Object ljtp = ((Map)resultLjUrl.get("partsInfo")).get("url");
			data.put("ljtp",ljtp);
		}
		//查询任务完成进度
		Parameters progressCondition = new Parameters();
		progressCondition.set("scrwbh", scrwbh);
		Bundle resultProgress = Sys.callModuleService("pc", "pcservice_caculateProgress", progressCondition);
		Object scrwjd = resultProgress.get("scrwjd");
		data.put("scrwjd",scrwjd);
		if (gdbcount > 0) {
			templateId = "sdbg_tp";
			roles = new String[] { "MANUFACTURING_MANAGEMENT_ROLE", "WORKER_ROLE" };// 关注该动态的角色
			data.put("bcbgsl", Integer.parseInt(bgsl));// 本次报工数量
			Bundle bglsbundle = Sys.callModuleService("pc", "pcservice_savebglsb", parameters);
			bglscount = (Integer) bglsbundle.get("count");
		}
		if (!"".equals(bfsl)) {
			data.put("bcbfsl", Integer.parseInt(bfsl));// 本次报废数量
		}
		Map<String, Object> returnmap = new HashMap<String, Object>();
		if (bglscount == 1 && gdbcount == 1) {
			sendActivity(activityType, templateId, true, roles, null, null, data);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日  HH时mm分");
			String message_type = "1";// 待办事项
			String url = Sys.getAbsoluteUrl("/ismes-web/pc/zlqr/query_zlqr?_m=quality_confirm");
			Map<String, Object> message_data = new HashMap<String, Object>();
			Date now = new Date();
			String bizType = "scrwpcxf";// 缺少刀具报警
			String bizId = gdbh;
			StringBuffer content = new StringBuffer();
			StringBuffer title = new StringBuffer();
			//产品名称（编号为***）的生产工单（编号为***）进行报工
			title.append(ljmc).append("（零件编号:").append(ljbh).append("）的生产工单（工单编号:").append(gdbh).append("）进行报工");
			//****年**月**日**时**分，产品名称（编号为***）的生产工单（工单编号为***，工序为****）进行报工，报工数量**件，请质检部门检
			content.append(sdf.format(now)).append(",").append(ljmc).append("（零件编号:")
				   .append(ljbh).append("）的生产工单（工单编号:").append(gdbh).append(",工序名称: ")
				   .append(gxmc).append( "）进行报工，报工数量:").append(bgsl).append("件，请质检部门检验确认。");
			
			sendMessage(message_type, title.toString(), null, content.toString(), "系统", bizType, bizId,
					"0"/* 信息优先级：0:一般，1：紧急 ， 2：非常紧急 */, url, roles, null, null,
					"system"/* manual:人工发送，system：系统发送，interface：外部接口 */, "ts"/* 消息来源ID */, message_data, now, null,
					null, null);
			
			returnmap.put("msg", "报工成功");
		} else {
			returnmap.put("msg", "报工失败");
		}
		//报废动态
		if (!"".equals(bfsl)) {
			templateId = "ljbf_tp";
			roles = new String[] { "MANUFACTURING_MANAGEMENT_ROLE" };// 关注该动态的角色
//			Bundle qualitybundle = Sys.callModuleService("war", "zlgj_service", parameters);
			sendActivity(activityType, templateId, true, roles, null, null, data);
		}
		bundle.put("data", returnmap);
		return "json:data";
	}

	/**
	 * 
	 * @param parameters
	 * @param bundle
	 * @return
	 * @throws ParseException 
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String saveBkg(Parameters parameters, Bundle bundle) throws ParseException {
		String gdbh = parameters.getString("gdtm");
		String pcbh = parameters.getString("pcbh");
//		String gxid = parameters.getString("gxid");
		String gxbh = parameters.getString("gxbh");
		String gxmc = parameters.getString("gxmc");
		String gdid = parameters.getString("gdid");
		
		String pcmc = parameters.getString("pcmc");
		String sbbh = parameters.getString("sbbh");
		String jgsl = parameters.getString("jgsl");
		String jhkssj = parameters.getString("jhkssj");
		String jhjssj = parameters.getString("jhjssj");
		parameters.set("gdid", gdid);
		String pcid = parameters.getString("pcid");
		String scrwid = parameters.getString("scrwid");
		Date date = new Date();
		String returnkgsj = sdf.format(date);
		parameters.set("sj", date);

		Bundle gdbbundle = Sys.callModuleService("pl", "plservice_updateGdbTime", parameters);
		int gdbcount = (Integer) gdbbundle.get("count");
		Map<String, Object> returnmap = new HashMap<String, Object>();
		if (gdbcount == 1) {
			returnmap.put("msg", "报开工成功");

			// 更新工单状态为加工中状态
			parameters.set("gdzt", "30");
			Sys.callModuleService("pl", "plservice_updategdxxByGdID", parameters);
			// 更新批次状态为加工中（70）
			parameters.set("scrwpcid", pcid);
			parameters.set("pcjhztdm", "70");
			Sys.callModuleService("pro", "proService_updateScrwpczt", parameters);
			// 更新生产任务状态为执行中（20）
			parameters.set("scrwid", scrwid);
			parameters.set("scrwztdm", "20");
			Sys.callModuleService("pro", "proService_updateScrwzt", parameters);

			//查询任务编号
			parameters.set("scrwpcid", pcid);
			Bundle scrwxxBundle = Sys.callModuleService("pro", "scrwAndPcInfoByPcidService", parameters);
			List<Map<String, Object>> scrwxx = (List<Map<String, Object>>) scrwxxBundle.get("scrwandpcList");
			Object scrwbh = scrwxx.get(0).get("scrwbh");
			//查询零件图片
			parameters.set("ljid", scrwxx.get(0).get("ljid"));
			Bundle resultLjUrl = Sys.callModuleService("pm", "partsInfoService", parameters);
			Object ljtp = ((Map)resultLjUrl.get("partsInfo")).get("url");
			Object ljmc = ((Map)resultLjUrl.get("partsInfo")).get("ljmc");
			Object ljbh = ((Map)resultLjUrl.get("partsInfo")).get("ljbh");
			//查询任务完成进度
			Parameters progressCondition = new Parameters();
			progressCondition.set("scrwbh", scrwbh);
			Bundle resultProgress = Sys.callModuleService("pc", "pcservice_caculateProgress", progressCondition);
			Object scrwjd = resultProgress.get("scrwjd");
			
			String activityType = "0"; // 动态任务
			String templateId = "bkg_tp";
			String[] roles = new String[] { "MANUFACTURING_MANAGEMENT_ROLE", "WORKER_ROLE" };// 关注该动态的角色
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("scrwbh", scrwbh);// 生产任务编号
			data.put("ljtp", ljtp);//零件图片
			data.put("scrwjd", scrwjd);//生产任务进度
			data.put("ljmc", ljmc);//零件名称
			data.put("ljbh", ljbh);//零件编号
			
			data.put("gdbh", gdbh);// 工单编号
			data.put("pcbh", pcbh);// 批次编号
			data.put("gxmc", gxmc);// 工序名称
			data.put("gxbh", gxbh);// 工序编号
			
			data.put("pcmc", pcmc);// 批次名称
			data.put("sbbh", sbbh);// 设备编号
			data.put("jgsl", jgsl);// 加工数量
			data.put("jhkssj", jhkssj);// 计划开始时间
			data.put("jhjssj", jhjssj);// 计划结束时间
			data.put("kgsj", date.getTime());// 开工时间
			data.put("userid", Sys.getUserIdentifier());// 操作人
			data.put("username", Sys.getUserName());// 操作人
			
			sendActivity(activityType, templateId, true, roles, null, null, data);

			returnmap.put("returnkgsj", returnkgsj);
		} else {
			returnmap.put("msg", "报开工失败");
			returnmap.put("returnkgsj", "");
		}
		bundle.put("data", returnmap);
		return "json:data";
	}

	/**
	 * 
	 * @param parameters
	 * @param bundle
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public String saveGzbj(Parameters parameters, Bundle bundle) {
		String sbtm = parameters.getString("sbtm");
		parameters.set("zybh", sbtm);
		int selectdj = parameters.getInteger("selectdj");
		int selectjj = parameters.getInteger("selectjj");
		int selectlj = parameters.getInteger("selectlj");
		int sum = 0;
		sum += isAdd(selectdj, parameters, GzgjStateConstant.缺少刀具);
		sum += isAdd(selectjj, parameters, GzgjStateConstant.缺少夹具);
		sum += isAdd(selectlj, parameters, GzgjStateConstant.缺少量具);

		Map<String, Object> returnmap = new HashMap<String, Object>();
		if (sum == (selectdj + selectjj + selectlj)) {

			// send message
			String message_type = "0";// 待办事项
			String[] message_roles = new String[] { "MANUFACTURING_MANAGEMENT_ROLE","MATERIAL_DELIVERY_ROLE" };//生产管理,物料配送
			Map<String, Object> message_data = new HashMap<String, Object>();
			StringBuffer content = new StringBuffer();
			StringBuffer title = new StringBuffer();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日  HH时mm分");
			Date now = new Date();
			String bizType = "scrwpcxf";// 缺少刀具报警
			String bizId = sbtm;
			String url = "/mf/wlps/query_wlps?_m=material_distribution";
			
			if(selectdj > 0){
				//机台位置缺少刀具告警
				title.append("\"").append(sbtm).append("\"机器").append(" 缺少刀具");
				//****年**月**日**时**分，机台位置缺少刀具，请及时送达。
				content.append(sdf.format(now)).append(",");
				content.append("\"").append(sbtm).append("\"机器").append(" 缺少刀具,请及时送达。");
				sendMessage(message_type, title.toString(), null, content.toString(), "系统", bizType, bizId,
						"0"/* 信息优先级：0:一般，1：紧急 ， 2：非常紧急 */, url, message_roles, null, null,
						"system"/* manual:人工发送，system：系统发送，interface：外部接口 */, "ts"/* 消息来源ID */, message_data, now, null, null,
						null);
			}
			
			if(selectjj > 0){
				//机台位置缺少夹具告警
				title.setLength(0);
				title.append("\"").append(sbtm).append("\"机器").append(" 缺少夹具");
				//****年**月**日**时**分，机台位置缺少夹具，请及时送达。
				content.setLength(0);
				content.append(sdf.format(now)).append(",");
				content.append("\"").append(sbtm).append("\"机器").append(" 缺少夹具,请及时送达。");
				sendMessage(message_type, title.toString(), null, content.toString(), "系统", bizType, bizId,
						"0"/* 信息优先级：0:一般，1：紧急 ， 2：非常紧急 */, url, message_roles, null, null,
						"system"/* manual:人工发送，system：系统发送，interface：外部接口 */, "ts"/* 消息来源ID */, message_data, now, null, null,
						null);
			}
			
			if(selectlj > 0){
				//机台位置缺少量具告警
				title.setLength(0);
				title.append("\"").append(sbtm).append("\"机器").append(" 缺少量具");
				//****年**月**日**时**分，机台位置缺少量具，请及时送达。
				content.setLength(0);
				content.append(sdf.format(now)).append(",");
				content.append("\"").append(sbtm).append("\"机器").append(" 缺少量具,请及时送达。");
				sendMessage(message_type, title.toString(), null, content.toString(), "系统", bizType, bizId,
						"0"/* 信息优先级：0:一般，1：紧急 ， 2：非常紧急 */, url, message_roles, null, null,
						"system"/* manual:人工发送，system：系统发送，interface：外部接口 */, "ts"/* 消息来源ID */, message_data, now, null, null,
						null);
			}
			
//			title.append("\"").append(sbtm).append("\"机器");
//			content.append(sdf.format(now)).append(",");
//			content.append("\"").append(sbtm).append("\"机器");
//			if(selectdj > 0){
//				//机台位置缺少刀具告警
//				title.append(" 缺少刀具、");
//				//****年**月**日**时**分，机台位置缺少刀具，请及时送达。
//				content.append(" 缺少刀具、");
//			}
//			
//			if(selectjj > 0){
//				//机台位置缺少夹具告警
//				title.append(" 缺少夹具、");
//				//****年**月**日**时**分，机台位置缺少夹具，请及时送达。
//				content.append(" 缺少夹具、");
//			}
//			
//			if(selectlj > 0){
//				//机台位置缺少量具告警
//				title.append(" 缺少量具、");
//				//****年**月**日**时**分，机台位置缺少量具，请及时送达。
//				content.append(" 缺少量具、");
//				
//			}
//			title.deleteCharAt(title.length()-1);  
//			content.deleteCharAt(content.length()-1);  
//			title.append("。");
//			content.append(",请及时送达。");
			
//			if((selectdj+selectjj+selectlj)>0){
//				sendMessage(message_type, title.toString(), null, content.toString(), "系统", bizType, bizId,
//						"0"/* 信息优先级：0:一般，1：紧急 ， 2：非常紧急 */, url, message_roles, null, null,
//						"system"/* manual:人工发送，system：系统发送，interface：外部接口 */, "ts"/* 消息来源ID */, message_data, now, null, null,
//						null);
//			}
			
			
			// send activity
			//查询生产任务批次信息
			parameters.set("val_sb", "('" + sbtm + "')");
			Bundle b_sbxx = Sys.callModuleService("em", "emservice_sbxxBysbbh", parameters);
			List<Map<String, Object>> sbxx = (List<Map<String, Object>>) b_sbxx.get("sbxx");

			Object sbmc = sbxx.get(0).get("sbmc");//设备名称
			Object sblx = sbxx.get(0).get("sblxid");//设备类型
			Object sbwz = sbxx.get(0).get("sbwz");//设备位置
			String activityType = "2"; //动态任务
			String[] roles = new String[] { "MANUFACTURING_MANAGEMENT_ROLE","MATERIAL_DELIVERY_ROLE" };//关注该动态的角色
			String templateId = "gzbj_tp";
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("sbbh", sbtm);//设备编号
			data.put("sbmc", sbmc);//设备名称
			data.put("sblx", sblx);//设备类型
			data.put("sbwz", sbwz);//设备位置
			data.put("userid", Sys.getUserIdentifier());//操作人
			data.put("usrename", Sys.getUserName());//操作人
			
//			data.put("czrid", Sys.getUserIdentifier());// 操作人
//			data.put("username", Sys.getUserName());// 操作人
			if(selectdj > 0){
				data.put("qsgz", "10");//缺少工装(刀具)
				data.put("gzlx", Sys.getDictFieldNames("gzlx", "10")[0]);
				sendActivity(activityType, templateId, true, roles, null, null, data);
			}
			
			if(selectjj > 0){
				data.put("qsgz", "20");//缺少工装(夹具)
				data.put("gzlx", Sys.getDictFieldNames("gzlx", "20")[0]);
				sendActivity(activityType, templateId, true, roles, null, null, data);
			}
			
			if(selectlj > 0){
				data.put("qsgz", "30");//缺少工装(量具)
				data.put("gzlx", Sys.getDictFieldNames("gzlx", "30")[0]);
				sendActivity(activityType, templateId, true, roles, null, null, data);
			}

			returnmap.put("msg", "工装报警成功");
		} else {
			returnmap.put("msg", "工装报警失败");
		}
		bundle.put("data", returnmap);
		return "json:data";
	}

	private int isAdd(int select, Parameters parameters, String content) {
		int count = 0;
		if (1 == select) {
			parameters.set("content", content);
			Bundle gjbundle = Sys.callModuleService("war", "gzgj_service", parameters);
			count = (Integer) gjbundle.get("count");
		}
		return count;
	}

	private Bundle sendActivity(String type, String templateId, boolean isPublic, String[] roles, String[] users,
			String[] group, Map<String, Object> data) {
		String PARAMS_TYPE = "type";
		String PARAMS_TEMPLATE_ID = "template_id";
		String PARAMS_PUBLIC = "public";
		String PARAMS_ROLE = "role";
		String PARAMS_USER = "user";
		String PARAMS_GROUP = "group";
		String PARAMS_DATA = "data";
		String SERVICE_NAME = "activity";
		String METHOD_NAME = "send";
		Parameters parameters = new Parameters();
		parameters.set(PARAMS_TYPE, type);
		parameters.set(PARAMS_TEMPLATE_ID, templateId);
		if (isPublic)
			parameters.set(PARAMS_PUBLIC, "1");
		if (roles != null && roles.length > 0)
			parameters.set(PARAMS_ROLE, roles);
		if (users != null && users.length > 0)
			parameters.set(PARAMS_USER, users);
		if (group != null && group.length > 0)
			parameters.set(PARAMS_GROUP, group);
		if (data != null && !data.isEmpty())
			parameters.set(PARAMS_DATA, data);
		return Sys.callModuleService(SERVICE_NAME, METHOD_NAME, parameters);
	}

	private Bundle sendMessage(String type, String title, String abs, String content, String from, String bizType,
			String bizId, String priority, String url, String[] roles, String[] users, String[] group,
			String sourceType, String sourceId, Map<String, Object> data, Date sendTime, String[] fileUri,
			String[] fileNames, long[] filesSize) {
		String PARAMS_TYPE = "message_type";
		String PARAMS_ROLE = "receiver_role";
		String PARAMS_USER = "receiver_user";
		String PARAMS_GROUP = "receiver_group";
		String PARAMS_TITLE = "title";
		String PARAMS_ABSTRACT = "abstract";
		String PARAMS_CONTENT = "content";
		String PARAMS_FROM = "from";
		String PARAMS_DATA = "data";
		String PARAMS_PRIORITY = "priority";
		String PARAMS_SOURCE_TYPE = "source_type";
		String PARAMS_SOURCE_ID = "source_id";
		String PARAMS_URL = "url";
		String PARAMS_FILE_URI = "file_uri";
		String PARAMS_FILE_NAME = "file_name";
		String PARAMS_FILE_SIZE = "file_size";
		String PARAMS_BIZTYPE = "biz_type";
		String PARAMS_BIZID = "biz_id";
		String PARAMS_SEND_TIME = "send_time";
		String SERVICE_NAME = "message";
		String METHOD_NAME = "send";
		Parameters parameters = new Parameters();
		parameters.set(PARAMS_TITLE, title);
		parameters.set(PARAMS_ABSTRACT, abs);
		parameters.set(PARAMS_CONTENT, content);
		parameters.set(PARAMS_FROM, from);
		parameters.set(PARAMS_BIZTYPE, bizType);
		parameters.set(PARAMS_BIZID, bizId);
		parameters.set(PARAMS_TYPE, type);
		parameters.set(PARAMS_PRIORITY, priority);
		parameters.set(PARAMS_USER, users);
		parameters.set(PARAMS_GROUP, group);
		parameters.set(PARAMS_ROLE, roles);
		parameters.set(PARAMS_SOURCE_TYPE, sourceType);
		parameters.set(PARAMS_SOURCE_ID, sourceId);
		parameters.set(PARAMS_URL, url);
		parameters.set(PARAMS_FILE_URI, fileUri);
		parameters.set(PARAMS_FILE_NAME, fileNames);
		parameters.set(PARAMS_FILE_SIZE, filesSize);
		parameters.set(PARAMS_SEND_TIME, sendTime);
		parameters.set(PARAMS_DATA, data);
		return Sys.callModuleService(SERVICE_NAME, METHOD_NAME, parameters);
	}
	
	
}
