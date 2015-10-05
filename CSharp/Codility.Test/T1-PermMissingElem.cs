using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using PermMissingElem;

namespace Codility.Test
{
    [TestClass]
    public class PermMissingElem
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            int[] A = new int[] { 2 };
            int result = s.solution(A);
            Assert.AreEqual(1, result);
        }

        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            int[] A = new int[] { 1, 3 };
            int result = s.solution(A);
            Assert.AreEqual(2, result);
        }

        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            int[] A = new int[] { 2, 3, 1, 5 };
            int result = s.solution(A);
            Assert.AreEqual(4, result);
        }

        [TestMethod]
        public void TestMethod4()
        {
            Solution s = new Solution();
            int[] A = Enumerable.Range(1, 100000).ToArray();
            for (int i = 3; i < A.Length; ++i)
            {
                A[i] += 1;
            }
            int result = s.solution(A);
            Assert.AreEqual(4, result);
        }


        [TestMethod]
        public void TestMethod5()
        {
            Solution s = new Solution();
            int[] A = Enumerable.Range(1, 100000).ToArray();
            for (int i = 0; i < A.Length; ++i)
            {
                A[i] += 1;
            }
            int result = s.solution(A);
            Assert.AreEqual(1, result);
        }
    }
}
